package com.exemple.Kaddem.ServiceInterface;

import java.util.List;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;

public interface EtudiantServiceInterface {

	
	//Done
	public List<Etudiant>retrieveAllEtudiants(); 
	
	//Done
	public Etudiant addEtudiant(Etudiant e);

	
	//Done
	public Etudiant updateEtudiant (Etudiant e);
	
	
	
	//Done
	public Etudiant retrieveEtudiant(Integer idEtudiant);
	
	
	//Done
	public void removeEtudiant(Integer idEtudiant);
	
	
	
	public void assignEtudiantDepartement(Integer etudiantId, Integer departementId);
	
	
}
