package com.exemple.Kaddem.Controller;


import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.ServiceInterface.ContratServiceInterface;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrat")
public class ContratController extends BaseController<Contrat, Integer>{

   /* @Autowired
    private ContratServiceInterface contratService;


    @GetMapping()
    public List<Contrat> contrats(){

        return contratService.retrieveAllContrats();

    }


    @PostMapping("/add")
    public ResponseEntity<Contrat> addContrat(@RequestBody Contrat contrat){

        return ResponseEntity.ok(this.contratService.addContrat(contrat));


    }

   // @PutMapping(path ="{id}")
   @PutMapping("/update/{id}")
    public ResponseEntity<Contrat>updateContrat(@RequestBody Contrat contrat){

        return ResponseEntity.ok(this.contratService.updateContrat(contrat));


    }



    @GetMapping("/{id}")
    public Contrat retrieveContrat (@PathVariable("id") Integer id) {

        return this.contratService.retrieveContrat(id);

    }


    @DeleteMapping("/delete/{id}")
    public void removeContrat(@PathVariable("id") Integer id) {

        this.contratService.removeContrat(id);

    }

*/
}