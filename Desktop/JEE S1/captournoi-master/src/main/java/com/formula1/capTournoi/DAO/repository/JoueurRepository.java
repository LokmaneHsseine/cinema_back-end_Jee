package com.formula1.capTournoi.DAO.repository;

import com.formula1.capTournoi.DAO.entite.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
