package com.exemple.Kaddem.Controller;

import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.EquipeRepository;
import com.exemple.Kaddem.ServiceInterface.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
@CrossOrigin("*")
public class EquipeController extends BaseController<Equipe, Integer>{
  
	@Autowired
	private EquipeRepository equipeRepo;
    
    @GetMapping("/count")
	private Integer getNumberOfEquipe(){
	    return  (int) equipeRepo.count();
	}
	
    
	
	
}


