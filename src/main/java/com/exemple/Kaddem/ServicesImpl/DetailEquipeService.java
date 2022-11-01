package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.DetailEquipe;
import com.exemple.Kaddem.Entity.Equipe;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.DetailEquipeRepository;
import com.exemple.Kaddem.Repositories.EquipeRepository;
import com.exemple.Kaddem.ServiceInterface.DetailEquipeServiceInterface;
import com.exemple.Kaddem.ServiceInterface.EquipeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetailEquipeService extends BaseServiceImp<DetailEquipe,Integer>implements DetailEquipeServiceInterface
{
  /*  @Autowired
    private DetailEquipeRepository DetequipeRepo;






    @Override
    public List<DetailEquipe> detailEquipe() {
        return null;
    }

    @Override
    public DetailEquipe adddetailEquipe(DetailEquipe e) {
        // TODO Auto-generated method stub

        return DetequipeRepo.save(e);

     

    }

    @Override
    public DetailEquipe updatedetailEquipe(DetailEquipe e) {
        if(retrievedetailEquipe(e.getIdDatailEquipe()) != null){

            return this.DetequipeRepo.save(e);

        }
        return null;

    }

    @Override
    public DetailEquipe retrievedetailEquipe(Integer id) {
        return null;
    }

    @Override
    public List<DetailEquipe> retrieveAlldetailEquipe(Integer idEquipe) {
        return null;
    }

    @Override
    public void removedetailEquipe(Integer idEquipe) {

    }

    //@Override
   //public DetailEquipe retrieveAlldetailEquipe(Integer idEquipe) {
     //   return new ArrayList<>(this.equipeRepo.findAll());
    //}

    //@Override
    //public  List<DetailEquipe> removedetailEquipe(Integer idEquipe) {
      //  this.equipeRepo.deleteById(idEquipe);

    //}

*/
}

