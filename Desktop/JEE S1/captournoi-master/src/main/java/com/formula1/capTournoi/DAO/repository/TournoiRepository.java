package com.formula1.capTournoi.DAO.repository;

import com.formula1.capTournoi.DAO.entite.Tournoi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournoiRepository extends JpaRepository<Tournoi ,Long> {
}
