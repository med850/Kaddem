package com.exemple.Kaddem.ServiceInterface;

import java.util.List;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;

public interface EtudiantServiceInterface extends BaseServiceInterface<Etudiant, Integer> {

/*	
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

	
	
	//Done
	public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
	
	
	Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);
	
	*/
	
	
	// public void assignEtudiantToDepartement (int etudiantId, int departementId);
	 
	 //public Etudiant addAndAssignEtudiant (Etudiant e,  Departement d);
	
	
	 void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) ;
	 
	 
	    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
	    List<Etudiant> getByEquipes (Integer idEquipe);

	public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant etudiant, Integer idEquipe, Integer idContrat);
	Etudiant assignEtudiantToEquipe(Integer idEt, Integer idEq);
	
}
