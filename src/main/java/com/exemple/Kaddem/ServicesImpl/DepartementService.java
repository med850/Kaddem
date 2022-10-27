package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.ServiceInterface.DepartementServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartementService implements DepartementServiceInterface {

    @Autowired
    private DepartementRepository departementRepository;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return new ArrayList<>(this.departementRepository.findAll());
    }

    @Override
    public Departement addDepartement(Departement d) {
        return this.departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return this.departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return this.departementRepository.findById(idDepart).orElse(null);
    }

}
