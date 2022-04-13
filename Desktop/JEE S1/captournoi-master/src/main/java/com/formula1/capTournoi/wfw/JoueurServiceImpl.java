package com.formula1.capTournoi.wfw;

import com.formula1.capTournoi.DAO.entite.Joueur;
import com.formula1.capTournoi.DAO.enumeration.Statut_joueur;
import com.formula1.capTournoi.DAO.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurServiceImpl implements IJoueurService{

    @Autowired
    private JoueurRepository joueurRepository;

    @Override
    public void initJoueur() {
        Joueur joueur1 = new Joueur();
        joueur1.setNom("lok");
        joueur1.setPrenom("hss");
        joueur1.setEmail("xxx@gmail.com");
        joueur1.setStatut_joueur(Statut_joueur.CAPITAINE);
        //joueur1.setEquipe();
        joueurRepository.save(joueur1);

    }
}
