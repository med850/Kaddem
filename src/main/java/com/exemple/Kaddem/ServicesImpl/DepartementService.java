package com.exemple.Kaddem.ServicesImpl;

import com.exemple.Kaddem.Entity.Departement;
import com.exemple.Kaddem.Entity.Etudiant;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.ServiceInterface.DepartementServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartementService extends BaseServiceImp<Departement,Integer>implements DepartementServiceInterface {

	
	 @Autowired
	    private DepartementRepository departementRepository;
	
	 @Autowired
	    private EtudiantRepository etudiantRepo;
	
	
	/*@Override
	public List<Etudiant> getEtudiantsByDepartement(int idDepart) {
		return etudiantRepo.findByDepartementIdDepart(idDepart);
		
	}*/

	

}
