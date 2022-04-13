package com.formula1.capTournoi.DAO.repository;

import com.formula1.capTournoi.DAO.entite.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe,Integer> {
}
