package com.exemple.Kaddem.ServiceInterface;

import com.exemple.Kaddem.Entity.Departement;

import java.util.List;

public interface DepartementServiceInterface {

    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);

}
