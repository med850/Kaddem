package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.EquipeRepository;
import com.exemple.Kaddem.ServiceInterface.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EquipeService extends BaseServiceImp<Equipe,Integer>implements EquipeServiceInterface {
    @Override
    public void faireEvoluerEquipes() {
        List<Equipe> equipes = this.retrieveAll();

    }

//    @Override
//    public void AssignEtudiantToEquipeAndContrat() {
//
//    }

}
