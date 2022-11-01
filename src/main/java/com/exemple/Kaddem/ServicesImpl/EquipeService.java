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

	/*
	@Autowired
	private EquipeRepository equipeRepo;
	
	
	@Override
	public List<Equipe> retrieveAllEquipes() {
		
		return new ArrayList<>(this.equipeRepo.findAll());
	}

	@Override
	public Equipe addEquipe(Equipe e) {
		// TODO Auto-generated method stub
		return equipeRepo.save(e);
	}

	@Override
	public Equipe updateEquipe(Equipe e) {
		if(retrieveEquipe(e.getId()) != null){
			return this.equipeRepo.save(e);
		}
		return null;

	}

	@Override
	public Equipe retrieveEquipe(Integer idEquipe) {
		System.out.println("retrieve Equipe");
		if(this.equipeRepo.findById(idEquipe).isPresent())
			return this.equipeRepo.findById(idEquipe).get();
		else
			return null;
	}

	@Override
	public void removeEquipe(Integer idEquipe) {
		this.equipeRepo.deleteById(idEquipe);
		
	}

	@Override
	public void faireEvoluerEquipes() {

	}

	@Override
	public void AssignEtudiantToEquipe() {

	}

*/
}
