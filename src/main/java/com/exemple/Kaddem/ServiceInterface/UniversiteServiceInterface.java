package com.exemple.Kaddem.ServiceInterface;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Entity.Option;
import com.exemple.Kaddem.Entity.Universite;

import java.util.List;


public interface UniversiteServiceInterface extends BaseServiceInterface<Universite, Integer>{
/*
    //Done
    public List<Universite> retrieveAllUniversite();

    //DONE
    public Universite addUniversite(Universite u );


    //DONE
    Universite updateUniversite (Universite u);


    //Done
    Universite retrieveUniversite (Integer idUniversite);


    //Done
    void removeUniversite (Integer idUniversite);*/
	
	
//	public void assignUniversiteToDepartement(int idUniversite, int idDepartement);
  //  public List<Departement> retrieveDepartementsByUniversite(int idUniv);


	 void assignUniversiteToDepartement(Integer idUniversite, Integer
	            idDepartement);
	 public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) ;
	
	
}
