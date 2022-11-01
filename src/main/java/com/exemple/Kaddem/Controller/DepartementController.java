package com.exemple.Kaddem.Controller;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Universite;
import com.exemple.Kaddem.ServiceInterface.DepartementServiceInterface;
import com.exemple.Kaddem.ServiceInterface.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depatement")
public class DepartementController extends BaseController<Departement, Integer>{
  /*  @Autowired
    private DepartementServiceInterface departementService;



    @GetMapping()
    public List<Departement> departements(){

        return departementService.retrieveAllDepartements();
    }

    @PostMapping()
    public ResponseEntity<Departement> addDepartement(@RequestBody Departement d){

        return ResponseEntity.ok(this.departementService.addDepartement(d));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Departement>update(@RequestBody Departement d){

        return ResponseEntity.ok(this.departementService.updateDepartement(d));


    }
    //NOTDONE
    @GetMapping("/{id}")
    public Departement departement(@PathVariable("id") Integer id) {

        return this.departementService.retrieveDepartement(id);

    }

*/
}
