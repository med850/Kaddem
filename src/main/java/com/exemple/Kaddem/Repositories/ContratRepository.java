package com.exemple.Kaddem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exemple.Kaddem.Entity.Contrat;


public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}
