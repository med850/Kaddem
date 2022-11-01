package com.exemple.Kaddem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController extends BaseController<Etudiant, Integer>{

	/*@Autowired
	private EtudiantServiceInterface etudiantService;
	
	
	
	@GetMapping()
	public List<Etudiant>etudiants(){
		
		return etudiantService.retrieveAllEtudiants();
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant etudiant){
		
		return ResponseEntity.ok(this.etudiantService.addEtudiant(etudiant));
		
		
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Etudiant>update(@RequestBody Etudiant etudiant){
		
		return ResponseEntity.ok(this.etudiantService.updateEtudiant(etudiant));
	
		
	}
	
	
	@GetMapping("/{id}")
	public Etudiant etudiant (@PathVariable("id") Integer id) {
		
		return this.etudiantService.retrieveEtudiant(id);
		
	}
	
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
			
		this.etudiantService.removeEtudiant(id);
		
	}

	@PutMapping("/add/{etudiantId}/{departmentId}")
	public void assignEtudiantToDepartment(@PathVariable Integer etudiantId,@PathVariable Integer departmentId)
	{
		this.etudiantService.assignEtudiantToDepartement(etudiantId,departmentId);
	}
	
	*/
	
}
