package com.formula1.capTournoi.DAO.entite;

import com.formula1.capTournoi.DAO.enumeration.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "tournoi")
public class Tournoi {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tournoi_id")
    private  Long id;

    private String libelle;

    @Temporal(TemporalType.DATE)
    private Date date_debut;

    @Temporal(TemporalType.DATE)
    private Date date_fin;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    private String wizard;

    @OneToMany
    @JoinColumn(name = "tournoi_id")
    private List<Groupe> groupes = new ArrayList<Groupe>();

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
