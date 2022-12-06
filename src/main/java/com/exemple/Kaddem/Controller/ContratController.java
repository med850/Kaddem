package com.exemple.Kaddem.Controller;


import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.Entity.Specialite;
import com.exemple.Kaddem.ServiceInterface.ContratServiceInterface;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contrat")
@CrossOrigin("*")
public class ContratController extends BaseController<Contrat, Integer>{

	@Autowired
    private ContratServiceInterface contratService;


	
	/* @PutMapping("/affectContratToEtudiant/{nomE}/{penomE}")
	    public Contrat affectContratToEtudiant (@RequestBody Contrat ce, @PathVariable String nomE,@PathVariable String penomE){
		 contratService.affectContratToEtudiant(ce,nomE,penomE);
	        return null;
	    }*/

	
	
//	  @PostMapping("Affect/{NomE}/{prenomE}")
//	    public Contrat affect(@RequestBody Contrat contrat, @PathVariable(value = "NomE") String NomE, @PathVariable(value = "prenomE") String prenomE){
//		  contratService.affectContratToEtudiant(contrat,NomE,prenomE);
//	        return contrat ;
//	    }

	@PostMapping("Affect/{idEtudiant}")
	public Contrat affect(@RequestBody Contrat contrat, @PathVariable(value = "idEtudiant") Integer idEtudiant){
		return contratService.affectContratToEtudiant(contrat,idEtudiant);

	}
	
	
	
	  
	    @GetMapping("nbrContrat/{date1}/{date2}")
	    public Integer nbContratsValides(@PathVariable(value = "date1") String date1, @PathVariable(value = "date2") String date2)
	    {
	        Date startDate = Date.valueOf(date1);
	        Date endDate = Date.valueOf(date2);
	        return contratService.nbContratsValides(startDate,endDate);
	    }
	    @GetMapping("status")
	    public String retrieveAndUpdateStatusContrat() throws Exception {
	        return contratService.retrieveAndUpdateStatusContrat();
	    }

	@GetMapping("ChiffreAffaire/{date1}/{date2}")
	public Map<Integer,Float> chiffreAffaire(@PathVariable(value = "date1") String date1, @PathVariable(value = "date2") String date2) throws ParseException {
		Date startDate = Date.valueOf(date1);
		Date endDate = Date.valueOf(date2);
		return contratService.getChiffreAffaireEntreDeuxDate(startDate,endDate);

	}

//	@GetMapping("getMontant/{date1}/{date2}/{idU}")
//	public Map<Specialite,Float> getMontantContrat(@PathVariable(value = "date1") String date1, @PathVariable(value = "date2") String date2, @PathVariable("idU") int idU) throws ParseException {
//		Date startDate = Date.valueOf(date1);
//		Date endDate = Date.valueOf(date2);
//		return contratService.getMontantContartEntreDeuxDate(idU, endDate, startDate);
//
//	}


	  
	  
	  
	
}