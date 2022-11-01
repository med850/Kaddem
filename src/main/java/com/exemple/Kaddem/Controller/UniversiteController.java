package com.exemple.Kaddem.Controller;



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
public class UniversiteController extends BaseController<Universite, Integer>{

  /*  @Autowired
    private UniversiteServiceInterface universiteService;



    @GetMapping("")
    public List<Universite> universites(){

        return universiteService.retrieveAllUniversite();
    }

    @PostMapping("")
    public ResponseEntity<Universite> addUniversite(@RequestBody Universite u){

        return ResponseEntity.ok(this.universiteService.addUniversite(u));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Universite>update(@RequestBody Universite u){

        return ResponseEntity.ok(this.universiteService.updateUniversite(u));


    }
    //NOTDONE
    @GetMapping("/{id}")
    public Universite universite(@PathVariable("id") Integer id) {

        return this.universiteService.retrieveUniversite(id);

    }
    //DONE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {

        this.universiteService.removeUniversite(id);
    }

*/

}
