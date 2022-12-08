package com.exemple.Kaddem.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ETUDIANT")
public class Etudiant {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	private String prenom;
	private String nom;


	@Enumerated(EnumType.STRING)
	private Option opt;


	@ManyToOne
	private Departement departement;


	@OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
	private Set<Contrat>contrats;



	

	@ManyToMany
	@JoinTable(name="ETUDIANT_EQUIPE")
	private List<Equipe> equipe = new ArrayList<>();



}