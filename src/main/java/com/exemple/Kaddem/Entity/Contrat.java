package com.exemple.Kaddem.Entity;

import java.util.Date;


import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin("*")
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

	private float montantContrat;
	private boolean archive;
	
	
	@ManyToOne
	private Etudiant etudiant;
	
	
	
}
