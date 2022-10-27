package com.exemple.Kaddem.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table (name="DetailEquipe")

public class DetailEquipe
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDatailEquipe;
    private Integer salle;
    private String thematique;


}
