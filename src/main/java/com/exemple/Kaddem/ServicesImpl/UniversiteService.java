package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Universite;
import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.Repositories.UniversiteRepository;
import com.exemple.Kaddem.ServiceInterface.UniversiteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversiteService extends BaseServiceImp<Universite,Integer> implements UniversiteServiceInterface {

  /*  @Autowired
    private UniversiteRepository universiteRepository;

    //DONE
    @Override
    public List<Universite> retrieveAllUniversite() {
        return new ArrayList<>(this.universiteRepository.findAll());
    }

    //DONE
    @Override
    public Universite addUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }

    //TO DO
    @Override
    public Universite updateUniversite(Universite u) {
        return this.universiteRepository.save(u);
    }


    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return this.universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        this.universiteRepository.deleteById(idUniversite);

    }
    
    
    */
}
