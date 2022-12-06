package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.*;
import com.exemple.Kaddem.Repositories.ContratRepository;
import com.exemple.Kaddem.Repositories.UniversiteRepository;
import com.exemple.Kaddem.ServiceInterface.ContratServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class ContratService extends BaseServiceImp<Contrat,Integer> implements ContratServiceInterface {

	
	   @Autowired //fieldinjection
	    private ContratRepository contratRepository;
	   
	   
	   @Autowired
	    EquipeService equipeService;
	    @Autowired
	    EtudiantService etudService;


	    @Autowired
		UniversiteRepository universiteRepository;
	   
	   

	@Override
	public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
		Contrat contrat = this.retrieve(idContrat);
		Equipe equipe = equipeService.retrieve(idEquipe);
		List<Equipe> se = new ArrayList<>();
		Set<Contrat> contrats = new HashSet<>();
		e.setContrats(contrats);
		se.add(equipe);
		e.setEquipe(se);
		etudService.add(e);
		return e;
	}

	@Override
	public Map<Specialite, Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate) {
		Specialite[] specialites = Specialite.values();
		Universite u = new Universite();
		Universite universite = universiteRepository.findById(idUniv).orElse(u);
		Map<Specialite, Float> map = new HashMap<>();
		List<Contrat> contrats;
		if(endDate.compareTo(startDate) >0)
		{
			List<Departement> ldept = universite.getDept();
			for(Departement dep:ldept){
				int montant=0;
				for( Specialite specialite : specialites){
//					contrats = contratRepository.findContratsByDepartmentAndSpecialite(dep.getId(), specialite);
//					contrats.forEach(System.out::println);
//					montant+=
				}
			}
		}

		return null;
	}

//	public Map<Specialite, Float>getMontantContratByDepartement(int idDept){
//		Map<Specialite, Float> map = new HashMap<>();
//		float montant = 0;
//		fo
//		return map;
//	}

	@Override
	public Contrat affectContratToEtudiant(Contrat ce, Integer idEtudiant) {
		Etudiant etudiant = etudService.retrieve(idEtudiant);

		if(contratRepository.findContratByEtudiantId(etudiant.getId()).size() < 2) {
			ce.setEtudiant(etudiant);
			this.add(ce);
			return this.retrieve(ce.getId());
		}else {
			return null;
		}
	}

	@Override
	public Map<Integer,Float> getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
		List<Contrat> contrats = this.retrieveAll();
		Map<Integer,Float> map = new HashMap<>();
		float chiffreAffaire  = 0 ;
		System.out.println(contrats);
		for (Contrat c : contrats) {

			Date datedebut = c.getDateDebutContrat();
			Date datefin = c.getDateFinContrat();
			System.out.println(c.getId());
			System.out.println(datedebut.after(startDate) + "/"+ datefin.before(endDate)+"/"+ c.isArchive());
			try {
				if (datedebut.after(startDate) && datefin.before(endDate) && !c.isArchive()) {
					switch (c.getSpecialite().name()) {
						case "IA":
							System.out.println(c.getSpecialite().name());
							map.put(c.getId(), 300f);
							break;
						case "RESEAUX":
							System.out.println(c.getSpecialite().name());
							map.put(c.getId(), 350f);
							break;
						case "CLOUD":
							System.out.println(c.getSpecialite().name());
							map.put(c.getId(), 400f);
							break;
						case "SECURITE":
							System.out.println(c.getSpecialite().name());
							map.put(c.getId(), 450f);
							break;
						default:
							System.out.println("no specialite");
							map.put(c.getId(), 0f);
							break;
					}
				}
			} catch (NullPointerException e) {
				System.out.println("null");
			}

		}
		return map;
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