package com.exemple.Kaddem.Controller;

import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.ServiceInterface.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController extends BaseController<Equipe, Integer>{
  
	
/*	@Autowired
    private EquipeServiceInterface equipeService;



    @GetMapping("/")
    public List<Equipe> equipes(){

        return equipeService.retrieveAllEquipes();

    }

    @PostMapping("/add")
    public ResponseEntity<Equipe> addEquipe(@RequestBody Equipe equipe){

        System.out.println("adding");
        return ResponseEntity.ok(equipeService.addEquipe(equipe));
    }
    @PutMapping("/update")
    public ResponseEntity<Equipe> updateEquipe(@RequestBody Equipe equipe){
//        Equipe eq
        System.out.println("looking if it exists");

        return ResponseEntity.ok(equipeService.updateEquipe(equipe));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {

        this.equipeService.removeEquipe(id);

    }
    
    */
}


