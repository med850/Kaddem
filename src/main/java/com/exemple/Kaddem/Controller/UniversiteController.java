package com.exemple.Kaddem.Controller;



import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Universite;

import com.exemple.Kaddem.ServiceInterface.UniversiteServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/universite")
@CrossOrigin("*")
public class UniversiteController extends BaseController<Universite, Integer>{

	@Autowired
    private UniversiteServiceInterface universiteService;

/*
 @PutMapping("/assignUniversiteToDepartement/{idUniv}/{idDepart}")
    public void assignUniversiteToDepartement(@PathVariable int idUniv, @PathVariable int idDepart){
	 universiteService.assignUniversiteToDepartement(idUniv,idDepart);
    }

    @RequestMapping( "retrieveDepartementsByUniversite/{idUniv}")
    public List<Departement> retrieveDepartementsByUniversite(@PathVariable int idUniv){
       return universiteService.retrieveDepartementsByUniversite(idUniv);
    }*/
	
	
	
	 @PostMapping("Assigne/{idU}/{idD}")
	    private Universite AddandAssigne(@PathVariable(value = "idU") Integer idU, @PathVariable(value = "idD") Integer idD){
		 universiteService.assignUniversiteToDepartement(idU,idD);
	        return universiteService.retrieve(idU);
	    }

}
