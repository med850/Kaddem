package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Universite;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.Repositories.UniversiteRepository;
import com.exemple.Kaddem.ServiceInterface.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UniversiteService extends BaseServiceImp<Universite,Integer> implements UniversiteServiceInterface {

	
	 @Autowired
	    private UniversiteRepository universiteRepository;
	 

	 @Autowired
	    private DepartementRepository departmentRepo;
	 
	 	
	 @Autowired
	    private DepartementService departService; 


	@Override
	public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
		 Universite universite = this.retrieve(idUniversite);
	        Departement departement = departService.retrieve(idDepartement);
	        List<Departement> sd = new ArrayList<>() ;
	        System.out.println(departement);
	        if(universite !=null && departement != null)
	        {
	            sd.add(departement);
	            universite.setDept(sd);
	            this.add(universite);
	        }
		
	}


	@Override
	public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
	
		
        Universite universite = this.retrieve(idUniversite);
		
		if(universite != null)
        {
            return new ArrayList<>(universite.getDept());
        }
		
		return null;
	}
	 
	
	
/*	@Override
	public void assignUniversiteToDepartement(int idUniversite, int idDepartement) {
		//recuperer les objets
        Universite universite = universiteRepository.findById((int)idUniversite).orElse(null);
        Departement departement = departmentRepo.findById((int)idDepartement).orElse(null);


        //vérification objet != null
        if(universite != null && departement != null){
            // affectation etudiant dans le departement
            universite.getDept().add(departement);
            // save
            universiteRepository.save(universite);
        }

		
	}

	@Override
	public List<Departement> retrieveDepartementsByUniversite(int idUniv) {
		 Universite universite = universiteRepository.findById(idUniv).orElse(null);
	        if(universite!= null){
	             universite.getDept();

	        }
	        return null;
	    }
	

  /*  @Autowired
    private UniversiteRepository universiteRepository;

    //DONE
    @Override
    public List<Universite> retrieveAllUniversite() {
        return new ArrayList<>(this.universiteRepository.findAll());
    }

    //DONE
    @Override
    public Universite addUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }

    //TO DO
    @Override
    public Universite updateUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }


    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return this.universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        this.universiteRepository.deleteById(idUniversite);

    }
    
    
    */
}
