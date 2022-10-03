package com.exemple.Kaddem.Entity.ServiceInterface;

import java.util.List;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;

public interface EtudiantServiceInterface {

	
	//Done
	public List<Etudiant>retrieveAllEtudiants(); 
	
	public Etudiant addEtudiant(Etudiant e, Option o);
	
	public Etudiant addAndAssignEtudiant(Etudiant e, Option o, Departement d);
	
	
	
	//Done
	public Etudiant updateEtudiant (Etudiant e);
	
	
	
	//Done
	public Etudiant retrieveEtudiant(Integer idEtudiant);
	
	
	//Done
	public void removeEtudiant(Integer idEtudiant);
	
	
	
}
