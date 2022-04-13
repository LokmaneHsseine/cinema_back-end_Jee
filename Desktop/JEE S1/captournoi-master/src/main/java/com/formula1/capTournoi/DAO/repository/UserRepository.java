package com.formula1.capTournoi.DAO.repository;

import com.formula1.capTournoi.DAO.entite.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
