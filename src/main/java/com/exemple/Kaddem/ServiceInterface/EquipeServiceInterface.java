package com.exemple.Kaddem.ServiceInterface;


import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;

import java.util.List;

public interface EquipeServiceInterface extends BaseServiceInterface<Equipe, Integer>{
 /*   public List<Equipe> retrieveAllEquipes();

    public Equipe addEquipe(Equipe e);



    //Done
    public Equipe updateEquipe (Equipe e);



    //Done
    public Equipe retrieveEquipe(Integer idEquipe);



    public void removeEquipe(Integer idEquipe);*/

    public void faireEvoluerEquipes();

}
