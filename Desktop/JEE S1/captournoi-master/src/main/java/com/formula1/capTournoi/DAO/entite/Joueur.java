package com.formula1.capTournoi.DAO.entite;

import com.formula1.capTournoi.DAO.enumeration.Statut_joueur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="joueur_id")
    private Long id;

    private String nom;
    private String prenom;
    private String email;

    @Enumerated(EnumType.STRING)
    private Statut_joueur statut_joueur;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

}
