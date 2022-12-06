package com.exemple.Kaddem.Entity;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
@Data
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
	@JsonIgnore
	private Etudiant etudiant;
	
	
	
}
