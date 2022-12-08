package com.exemple.Kaddem.Controller;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Universite;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.ServiceInterface.DepartementServiceInterface;
import com.exemple.Kaddem.ServiceInterface.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
@CrossOrigin("*")
public class DepartementController extends BaseController<Departement, Integer>{
	
	
	@Autowired
	private DepartementRepository departementRepo;
	
  
	 @GetMapping("/count")
		private Integer getNumberOfDept(){
		    return  (int) departementRepo.count();
		}
		
	    
	
	
}
