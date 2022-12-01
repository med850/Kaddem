package com.exemple.Kaddem.Repositories;

import java.util.List;
import java.util.Map;

import com.exemple.Kaddem.Entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;


public interface ContratRepository extends  BaseRepository<Contrat, Integer> {
	
	
	//public List<Contrat> countContrat();
	
	//public int countByArchiveIsFalseAndEtudiantNomEAndEtudiantPrenomE(String nomE, String prenomE);
	
    List<Contrat> findContratByEtudiantId(Integer id);

//    @Query("SELECT con as montant FROM Departement.id " +
//            "INNER JOIN  Contrat con ON con.id = Departement.id " +
//            "INNER JOIN  Etudiant etud ON etud.id = con.id " +
//            "Where Departement.id = :idDepartment and con.specialite = :specialite")
//    List<Contrat> findContratsByDepartmentAndSpecialite(@Param("idDepartment") int idDepartment, @Param("specialite") Specialite specialite);
	
	
}