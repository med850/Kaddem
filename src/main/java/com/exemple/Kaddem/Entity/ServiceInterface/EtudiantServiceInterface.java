package com.exemple.Kaddem.Entity.ServiceInterface;

import java.util.List;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;

public interface EtudiantServiceInterface {

	
	public List<Etudiant>retrieveAllEtudiants(); 
	
	public Etudiant addEtudiant(Etudiant e, Option o);
	
	public Etudiant addAndAssignEtudiant(Etudiant e, Option o, Departement d);
	
	public Etudiant updateEtudiant (Etudiant e);
	
	public Etudiant retrieveEtudiant(Integer idEtudiant);
	
	public void removeEtudiant(Integer idEtudiant);
	
	
	
}
