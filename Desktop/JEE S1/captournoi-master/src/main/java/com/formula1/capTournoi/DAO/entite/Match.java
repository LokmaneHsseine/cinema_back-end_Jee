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

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="matchFoot")

public class Match {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="match_id")
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    private String equipe_gagnante;

    @ManyToMany
    @JoinTable(
            name = "equipe_match",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "equipe_id")
    )
    private List<Equipe> equipes = new ArrayList<>();


}
