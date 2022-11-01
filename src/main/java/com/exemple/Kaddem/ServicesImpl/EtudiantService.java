package com.exemple.Kaddem.ServicesImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import com.exemple.Kaddem.Repositories.ContratRepository;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.Repositories.EquipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;


@Service
public class EtudiantService extends BaseServiceImp<Etudiant,Integer> implements EtudiantServiceInterface{

/*	
	@Autowired
	private EtudiantRepository etudiantRepo;
	@Autowired
	private DepartementRepository depatmentRepo;
	@Autowired
	private EquipeRepository equipeRepo;
	@Autowired
	private ContratRepository contratRepo;

	
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

	@Override
	public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
		Etudiant etudiant = etudiantRepo.save(e);
		//Optional<Equipe> equipe = equipeRepo.findById(idEquipe);
		Equipe equipe = equipeRepo.findById((Integer)idEquipe).orElse(null);
		//Contrat contrat = 
		return null;
	}
	*/

}
