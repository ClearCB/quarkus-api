package edu.craptocraft.finalapiquarkus.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class SampleOTM {

    @Id
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "sampleOTM")
    public Set<SampleMTO> samples = new HashSet<>();

    public SampleOTM(int id, String name) {

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
