package com.exemple.Kaddem.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Table(name = "EQUIPE")
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	private String nomEquipe;
	
	@Enumerated(EnumType.STRING)
	private Niveau niveau;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Etudiant> etudiant = new ArrayList<>();
	
	
	@OneToOne
    private DetailEquipe detailEquipe;
	
	
}
