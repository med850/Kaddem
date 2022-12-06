package com.exemple.Kaddem.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

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








