package com.formula1.capTournoi.DAO.entite;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "groupe")
public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="groupe_id")
    private int id;



    @OneToMany
    @JoinColumn(name = "groupe_id")
    private List<Equipe> equipes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "tournoi_id")
    private Tournoi tournoi;
}
