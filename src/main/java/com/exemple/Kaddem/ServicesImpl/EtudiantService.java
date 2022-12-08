package com.exemple.Kaddem.ServicesImpl;

import java.util.*;

import com.exemple.Kaddem.Entity.*;
import com.exemple.Kaddem.Repositories.ContratRepository;
import com.exemple.Kaddem.Repositories.DepartementRepository;
import com.exemple.Kaddem.Repositories.EquipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.Kaddem.Repositories.EtudiantRepository;
import com.exemple.Kaddem.ServiceInterface.EtudiantServiceInterface;

import javax.transaction.Transactional;


@Service
public class EtudiantService extends BaseServiceImp<Etudiant,Integer> implements EtudiantServiceInterface{

	@Autowired
	private EtudiantRepository etudiantRepo;
	@Autowired
	private DepartementRepository depatmentRepo;

	@Autowired
	private DepartementService departService ;

	@Autowired
	private EquipeRepository equipeRepository;

	@Autowired
	private ContratRepository contratRepository;




	@Override
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
		 Etudiant etudiant = this.retrieve(etudiantId);
	        Departement departement = departService.retrieve(departementId);
	        System.out.println(departement);
	        if(etudiant !=null && departement != null)
	        {
	            etudiant.setDepartement(departement);
	            this.add(etudiant);
	        }

	}
	@Override
	public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
		 Departement departement = departService.retrieve(idDepartement);
	        if(departement != null)
	        {
	           return etudiantRepo.findByDepartement(departement);
	        }
		return null;
	}

	@Override
	public List<Etudiant> getByEquipes(Integer idEquipe) {
		Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
		return etudiantRepo.findByEquipe(equipe);
	}

	@Override
	@Transactional
	public Etudiant addAndAssignEtudiantToEquipeAndDepartement(Etudiant etudiant, Integer idEquipe, Integer idDepartement) {
		Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
		System.out.println(equipe);
		Departement departement = depatmentRepo.findById(idDepartement).orElse(null);
		etudiant.setDepartement(departement);
		List<Equipe> equipes = new ArrayList<>();
		Set<Contrat> contrats = new HashSet<>();
		equipes.add(equipe);
		etudiant.setEquipe(equipes);
		etudiant.setContrats(contrats);
		this.add(etudiant);
		return etudiant;
	}

	@Override
	@Transactional
	public Etudiant addAndAssignEtudiantToEquipeAndContrat(Etudiant etudiant, Integer idEquipe, Integer idContrat) {
		Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
		System.out.println(equipe);
		Contrat contrat = contratRepository.findById(idContrat).orElse(null);
		List<Equipe> equipes = new ArrayList<>();
		Set<Contrat> contrats = new HashSet<>();
		contrats.add(contrat);
		equipes.add(equipe);
		etudiant.setEquipe(equipes);
		etudiant.setContrats(contrats);
		this.add(etudiant);
		return etudiant;
	}

	@Override
	@Transactional
	public Etudiant assignEtudiantToEquipe(Integer idEt, Integer idEquipe){
		Etudiant etudiant = new Etudiant();
		etudiant = etudiantRepo.findById(idEt).orElse(etudiant);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
		etudiant.setEquipe(equipes);
		this.add(etudiant);


        return etudiant;
	}


	public Etudiant findByNomAndPrenom(String nomE, String prenomE) {
	        List<Etudiant> etudiants = etudiantRepo.findAll();
	        Etudiant et = new Etudiant();
	        for (Etudiant e : etudiants) {
	            if (e.getPrenom().equals(nomE) && e.getNom().equals(prenomE)) {
	                et = e;
	                return et;
	            }
	        }
	        return et ;


	 }




}
