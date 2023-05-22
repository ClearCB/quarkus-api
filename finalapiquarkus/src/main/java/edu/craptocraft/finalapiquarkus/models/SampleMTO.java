package edu.craptocraft.finalapiquarkus.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SampleMTO {

    @Id
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "sampleOTM_id")
    public SampleOTM sampleOTM;

    public SampleMTO(int id, String name) {

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
