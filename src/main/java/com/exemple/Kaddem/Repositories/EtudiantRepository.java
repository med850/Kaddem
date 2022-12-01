package com.exemple.Kaddem.Repositories;

import java.util.List;
import java.util.Optional;

import com.exemple.Kaddem.Entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;




public interface EtudiantRepository extends BaseRepository<Etudiant, Integer>{

	

//	public Set<Etudiant>findByDep
	
	//public List<Etudiant> findByDepartementIdDepart(int idDepart);

	public Etudiant findByNomAndPrenom(String nomE, String prenomE);
	
	  List<Etudiant> findByDepartement(Departement departement);

	  List<Etudiant> findByEquipe(Equipe equipe);

	
}
