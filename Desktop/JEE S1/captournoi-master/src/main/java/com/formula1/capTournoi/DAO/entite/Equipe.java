package com.formula1.capTournoi.DAO.entite;

import com.formula1.capTournoi.DAO.enumeration.Site;
import com.formula1.capTournoi.DAO.enumeration.Statut;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "equipe")
public class Equipe {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
@Column(name="equipe_id")
    private Long id;

    private String nom_equipe;
    private int match_jouer;
    private int point;
    private int but_marque;
    private int but_concede;
    private int difference;
    private int position;

    @Enumerated(EnumType.STRING)
    private Site site;

    @Enumerated(EnumType.STRING)
    private Statut statut;


    @ManyToOne
    @JoinColumn(name = "groupe_id")
    private Groupe groupe;



    @ManyToMany
    @JoinTable(
            name = "equipe_match",
            joinColumns = @JoinColumn(name = "equipe_id"),
            inverseJoinColumns = @JoinColumn(name = "match_id")
    )
    private List<Match> matchs = new ArrayList<>();



    @OneToMany
    @JoinColumn(name = "equipe_id")
    private List<Joueur> joueurs = new ArrayList<Joueur>();









}
