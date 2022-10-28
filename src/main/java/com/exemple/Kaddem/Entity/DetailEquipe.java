package com.exemple.Kaddem.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class DetailEquipe {

	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idDatailEquipe;
	    private Integer salle;
	    private String thematique;
	    @OneToOne(mappedBy = "detailEquipe")
	    private Equipe equipe;
	
	
}








