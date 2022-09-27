package com.exemple.Kaddem.Entity;

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
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	private String prenom;
	private String nom;
	
	@Enumerated(EnumType.STRING)
	private Option option;
	
	@ManyToOne
	private Departement departement;
	
	@OneToOne(mappedBy = "etudiant")
	private Contrat contrat;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="Etudiant_Equipe_Table", joinColumns = {
			 @JoinColumn(name="etudiant_id", referencedColumnName="Id")
		    
	},
	inverseJoinColumns = {
			 @JoinColumn(name="equipe_id", referencedColumnName="Id")
	})
	private Set<Equipe>equipe;
	
	
	
}
