package com.exemple.Kaddem.Entity;

import java.util.LinkedHashSet;
import java.util.Set;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "DEPARTEMENT")
public class Departement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	private String nomDepartment;

	
	@OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Etudiant>eutidants = new LinkedHashSet<>();

}
