package edu.craptocraft.finalapiquarkus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SampleOne")
public class SampleOne {

    @Id
    private int id;

    @Column
    private String name;

    public SampleOne() {
        // Evitar problemas
    }

    public SampleOne(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
