package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Contrat;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.ContratRepository;
import com.exemple.Kaddem.ServiceInterface.ContratServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratService extends BaseServiceImp<Contrat,Integer> implements ContratServiceInterface {

	/*
    @Autowired //fieldinjection
    private ContratRepository contratRepo;

    public List<Contrat> retrieveAllContrats() {

        return new ArrayList<>(this.contratRepo.findAll());
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return this.contratRepo.save(ce);
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return this.contratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return this.contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        this.contratRepo.deleteById(idContrat);

    }*/
}