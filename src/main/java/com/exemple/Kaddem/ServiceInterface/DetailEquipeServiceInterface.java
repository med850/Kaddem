package com.exemple.Kaddem.ServiceInterface;

import com.exemple.Kaddem.Entity.DetailEquipe;
import com.exemple.Kaddem.Entity.Equipe;

import java.util.ArrayList;
import java.util.List;

public interface DetailEquipeServiceInterface
{
    public List<DetailEquipe> detailEquipe();

    public DetailEquipe adddetailEquipe(DetailEquipe de);



    //Done
    public DetailEquipe updatedetailEquipe (DetailEquipe de);



    //Done
    public DetailEquipe retrievedetailEquipe(Integer id);


    public List<DetailEquipe> retrieveAlldetailEquipe(Integer idEquipe);



    public void removedetailEquipe(Integer idEquipe);


}