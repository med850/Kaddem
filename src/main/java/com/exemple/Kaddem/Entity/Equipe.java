package com.exemple.Kaddem.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
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
	
	
	
	@ManyToMany(mappedBy ="equipe", fetch = FetchType.EAGER)
	@JsonIgnore
	private List<Etudiant> etudiant = new ArrayList<>();
	
	
	@OneToOne
    private DetailEquipe detailEquipe;
	
	
}
