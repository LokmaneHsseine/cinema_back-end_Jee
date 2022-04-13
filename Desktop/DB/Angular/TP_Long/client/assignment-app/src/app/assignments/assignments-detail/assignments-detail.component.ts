import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AssignmentsService } from 'src/app/shared/assignments.service';
import { AuthService } from 'src/app/shared/auth.service';
import { Assignement } from '../assignments.model';

@Component({
  selector: 'app-assignments-detail',
  templateUrl: './assignments-detail.component.html',
  styleUrls: ['./assignments-detail.component.css']
})
export class AssignmentsDetailComponent implements OnInit {

  assignmentTransmis?:Assignement;

  constructor(private assignmentService:AssignmentsService,
              private route:ActivatedRoute,
              private router:Router,
              private authService:AuthService) { }

  ngOnInit(): void {
    console.log("Detail detail")

    // On récupere l'id dans url
    let id:number = +this.route.snapshot.params['id'];
    this.assignmentService.getAssignments(id)
    .subscribe(assignment=>{
      this.assignmentTransmis = assignment;
    })
  }


  onDelete(){
    if(this.assignmentTransmis){
      this.assignmentService.deleteAssignment(this.assignmentTransmis)
      .subscribe(message=>{
        console.log(message);
        this.router.navigate(["/home"]);
      })
        this.assignmentTransmis = undefined;

        //la redirection
        
    }
  }


  onAssignmentRendu(){
    if(this.assignmentTransmis)
      this.assignmentTransmis.rendu = true;

      this.assignmentService.updateAssignment(this.assignmentTransmis)
      .subscribe(message=>{
        console.log(message);
        this.router.navigate(["/home"]);
      })
  }

  onClickEdit(){
    this.router.navigate(["/assignment",this.assignmentTransmis?.id,"edit"]);
  }


  isAdmin(){
    return this.authService.loggedIn;
  }
}
