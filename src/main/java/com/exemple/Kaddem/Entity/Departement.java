package com.exemple.Kaddem.Entity;

import java.util.Set;

import javax.persistence.*;

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
	private Set<Etudiant>eutidants;
}
