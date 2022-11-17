package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.ContratRepository;
import com.exemple.Kaddem.ServiceInterface.ContratServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ContratService extends BaseServiceImp<Contrat,Integer> implements ContratServiceInterface {

	
	   @Autowired //fieldinjection
	    private ContratRepository contratRepo;
	   
	   
	   @Autowired
	    EquipeService equipeService;
	    @Autowired
	    EtudiantService etudService;
	   
	   

	@Override
	public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
		 Contrat contrat = this.retrieve(idContrat);
	        Equipe equipe = equipeService.retrieve(idEquipe);
	        Set<Contrat> sd = new HashSet<>();
	        Set<Equipe> se = new HashSet<>();
	        sd.add(contrat);
	      //  e.setContrat(sd);
	        se.add(equipe);
	        e.setEquipe(se);
	        etudService.add(e);
	        return e;
	}

	@Override
	public Contrat affectContratToEtudiant(Contrat ce, String NomE, String prenomE) {
		/* Etudiant etudiant = etudService.findByNomAndPrenom(NomE, prenomE);
	        if(contratRepository.findContratByEtudiantId(etudiant.getId()).size() < 2) {
	            Contrat contrat = this.findById(ce.getId());
	            ce.setEtudiant(etudiant);
	            this.update(ce);
	            return this.findById(ce.getId());
	        }else {
	            return null;
	        }*/
		return null;
	}

	@Override
	public Map<Integer, Float> getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer nbContratsValides(Date startDate, Date endDate) {
		 List<Contrat> contrats = this.retrieveAll();
	        int nbContratsValides = 0 ;
	        for (Contrat c : contrats) {
	            Date datedebut = c.getDateDebutContrat();
	            Date datefin = c.getDateFinContrat();
	            if (!c.isArchive()) {
	                nbContratsValides++;
	            }
	        }
	        return nbContratsValides;
	}

	@Override
	@Scheduled(fixedRate = 3000)
    public String retrieveAndUpdateStatusContrat() throws Exception {
        List<Contrat> contrats = this.retrieveAll();
        List<String> contratsValides = new ArrayList<>();
        List<String> contratfini = new ArrayList<>();
        String contrat = "";
        String contratInfo = "" ;
        for (Contrat c : contrats) {
            try {
                Date datefin = c.getDateFinContrat();
                Date today = java.sql.Date.valueOf(java.time.LocalDate.now());
                contratInfo = "Contrat [ " +"\n" +" ContratId :" + c.getId() + " \n" +
                        " dateFin : "+ datefin + " \n"+ " Etudiant : " +c.getEtudiant().getNom() + " " +
                        "  " +c.getEtudiant().getPrenom() + "\n"+" Specialite : " + c.getSpecialite() + " ] ";
                if (c.isArchive()) {
                    if (datefin.getTime() - today.getTime() > 15) {
                        contratsValides.add(contratInfo);
                        contrat = contrat.concat("List de Contrat a revoir " + contratsValides.toString()+"\n");
                    }
                }
                boolean b = datefin.compareTo(today) == 0 && LocalDateTime.now().getHour() == 13; ;

                if (b) {
                    contratfini.add(contratInfo);
                    contrat = contrat.concat("List de Contrat fini"+contratfini.toString());
                    c = this.retrieve(c.getId());
                    c.setArchive(true);
                    this.update(c);
                }
            } catch (NullPointerException e) {
                e.getCause();
               // System.out.println("null");
            }
        }
        Thread.sleep(2000);
        System.out.println(contrat);
        return  contrat;
         }
	
	
	   
	   
	   
	/*@Override
	public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
		Etudiant  etudiant = new Etudiant();
		int nbContratActif = contratRepo.countByArchiveIsFalseAndEtudiantNomEAndEtudiantPrenomE(nomE,prenomE);

		if(nbContratActif<5){
		    ce.setEtudiant(etudiant);
		    contratRepo.save(ce);
		}
		return null;
		    }*/
		
	

	
 

 
}