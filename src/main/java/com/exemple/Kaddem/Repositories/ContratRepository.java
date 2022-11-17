package com.exemple.Kaddem.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;


public interface ContratRepository extends  BaseRepository<Contrat, Integer> {
	
	
	//public List<Contrat> countContrat();
	
	//public int countByArchiveIsFalseAndEtudiantNomEAndEtudiantPrenomE(String nomE, String prenomE);
	
    List<Contrat> findContratByEtudiantId(Integer id);
	
	
}