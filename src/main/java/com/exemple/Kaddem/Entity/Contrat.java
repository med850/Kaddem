package com.exemple.Kaddem.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTRAT")
public class Contrat {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebutContrat;
	
	@Temporal(TemporalType.DATE)
	private Date dateFinContrat;
	
	@Enumerated(EnumType.STRING)
	private Specialite specialite;
	
	private boolean archive;
	
	
	@OneToOne
	private Etudiant etudiant;
	
	
	
}
