package com.exemple.Kaddem.ServiceInterface;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Specialite;

public interface ContratServiceInterface extends BaseServiceInterface<Contrat, Integer>{

  /*  public List<Contrat> retrieveAllContrats();
    public Contrat addContrat (Contrat ce);
    public Contrat updateContrat (Contrat ce);
    public Contrat retrieveContrat (Integer idContrat);
    public void removeContrat(Integer idContrat);*/
	// public Contrat affectContratToEtudiant (Contrat ce,String nomE,String prenomE);
	
	
	Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,
		            Integer idEquipe);
	Map<Specialite,Float> getMontantContartEntreDeuxDate(int idUniv, Date
		startDate, Date endDate);
	Contrat affectContratToEtudiant(Contrat ce, Integer idEtudiant);
	Map<Integer,Float> getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) ;

	Integer nbContratsValides(Date startDate, Date endDate);

	String retrieveAndUpdateStatusContrat() throws InterruptedException, Exception;



	
	
}