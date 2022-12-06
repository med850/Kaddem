package com.exemple.Kaddem.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetailEquipe {

	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idDatailEquipe;
	    private Integer salle;
	    private String thematique;
	    @OneToOne(mappedBy = "detailEquipe")
		  @JsonIgnore
	    private Equipe equipe;
	
	
}








