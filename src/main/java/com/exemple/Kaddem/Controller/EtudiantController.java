package com.exemple.Kaddem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.ServiceInterface.EtudiantServiceInterface;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

	@Autowired
	private EtudiantServiceInterface etudiantService;
	
	
	
	@GetMapping("/")
	public List<Etudiant>etudiants(){
		
		return etudiantService.retrieveAllEtudiants();
		
	}
	
	
}
