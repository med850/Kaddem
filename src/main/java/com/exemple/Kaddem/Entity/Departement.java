package com.exemple.Kaddem.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DEPARTEMENT")
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer id;
	private String nomDepartment;
	
<<<<<<< HEAD
	@OneToMany(mappedBy = "departement")
=======
	@OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
>>>>>>> ef788409931310c8de58238da47d3ac819c6d657
	private Set<Etudiant>eutidants;
}
