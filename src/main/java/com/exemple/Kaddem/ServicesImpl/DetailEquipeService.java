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

}

