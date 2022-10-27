package com.exemple.Kaddem.ServicesImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.exemple.Kaddem.Repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;


@Service
public class EtudiantService implements EtudiantServiceInterface{

	
	@Autowired
	private EtudiantRepository etudiantRepo;
	@Autowired
	private DepartementRepository depatmentRepo;

	
	//private DepartmentRepository depRepo;
	
	
	@Override
	public List<Etudiant> retrieveAllEtudiants() {
		
		return new ArrayList<>(this.etudiantRepo.findAll());
	}

	@Override
	public Etudiant addEtudiant(Etudiant e) {
		return etudiantRepo.save(e);
	}



	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		
		if(retrieveEtudiant(e.getId())!= null) 
			
			return this.etudiantRepo.save(e);
		
		
		return null;
		
		
	}

	
	
	@Override
	public Etudiant retrieveEtudiant(Integer idEtudiant) {
		
		return this.etudiantRepo.findById(idEtudiant).get();
	}

	@Override
	public void removeEtudiant(Integer idEtudiant) {
		this.etudiantRepo.deleteById(idEtudiant);
		
	}


	
	
	


	@Override
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
		 Etudiant etudiant =  etudiantRepo.findById((Integer)etudiantId).orElse(null);
	     Departement departement =depatmentRepo.findById((Integer)departementId).orElse(null);
	     //verification
	      if(etudiant != null && departement != null)
	       {
	           //Traitement
	        etudiant.setDepartement(departement);
	           //Save
	        etudiantRepo.save(etudiant);
	       }
		
		
	}

}
