package com.exemple.Kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;


public interface ContratRepository extends  BaseRepository<Contrat, Integer> {
}