package edu.craptocraft.onequarkusapp.models;

import jakarta.persistence.Entity;

@Entity
@Table(name = "t_ordenes")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordenId;

}
