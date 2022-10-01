package com.exemple.Kaddem.ServicesImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.Entity.ServiceInterface.EtudiantServiceInterface;
import com.exemple.Kaddem.Repositories.EtudiantRepository;


@Service
public class EtudiantService implements EtudiantServiceInterface{

	
	@Autowired
	private EtudiantRepository etudiantRepo;
	
	
	
	
	
	
	@Override
	public List<Etudiant> retrieveAllEtudiants() {
		
		return new ArrayList<>(this.etudiantRepo.findAll());
	}

	@Override
	public Etudiant addEtudiant(Etudiant e, Option o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant addAndAssignEtudiant(Etudiant e, Option o, Departement d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		
		return this.etudiantRepo.save(e);
	}

	@Override
	public Etudiant retrieveEtudiant(Integer idEtudiant) {
		
		return this.etudiantRepo.findById(idEtudiant).get();
	}

	@Override
	public void removeEtudiant(Integer idEtudiant) {
		this.etudiantRepo.deleteById(idEtudiant);
		
	}

}
