package com.exemple.Kaddem.Controller;

import com.exemple.Kaddem.Entity.DetailEquipe;
import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.ServiceInterface.DetailEquipeServiceInterface;
import com.exemple.Kaddem.ServiceInterface.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailequipe")
@CrossOrigin("*")
public class DetailEquipeController extends BaseController<DetailEquipe, Integer>{

   /* @Autowired
    private DetailEquipeServiceInterface dtequipe;

    @GetMapping("/")
    public List<DetailEquipe> equipes(){

        return dtequipe.detailEquipe();

    }

    @PostMapping("/add")
    public ResponseEntity<DetailEquipe> addEquipe(@RequestBody DetailEquipe equipe){

        System.out.println("adding");
        return ResponseEntity.ok(dtequipe.adddetailEquipe(equipe));
    }
    @PutMapping("/update")
    public ResponseEntity<DetailEquipe> updateEquipe(@RequestBody DetailEquipe equipe){
//        Equipe eq
        System.out.println("looking if it exists");

        return ResponseEntity.ok(dtequipe.updatedetailEquipe(equipe));
    }
    
    
    */
}


