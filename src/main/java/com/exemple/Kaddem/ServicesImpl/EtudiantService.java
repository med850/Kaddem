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

	@Autowired
	private EtudiantRepository etudiantRepo;
	@Autowired
	private DepartementRepository depatmentRepo;
	
	  @Autowired
	  private DepartementService departService ;
	
	
	
	
	@Override
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
		 Etudiant etudiant = this.retrieve(etudiantId);
	        Departement departement = departService.retrieve(departementId);
	        System.out.println(departement);
	        if(etudiant !=null && departement != null)
	        {
	            etudiant.setDepartement(departement);
	            this.add(etudiant);
	        }
		
	}
	@Override
	public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
		 Departement departement = departService.retrieve(idDepartement);
	        if(departement != null)
	        {
	           return etudiantRepo.findByDepartement(departement);
	        }
		return null;
	}
	
	
	
	

	 public Etudiant findByNomAndPrenom(String nomE, String prenomE) {
	        List<Etudiant> etudiants = etudiantRepo.findAll();
	        Etudiant et = new Etudiant();
	        for (Etudiant e : etudiants) {
	            if (e.getPrenom().equals(nomE) && e.getNom().equals(prenomE)) {
	                et = e;
	                return et;
	            }
	        }
	        return et ;
	        
	        
	 }



}
