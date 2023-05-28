package edu.craptocraft.finalapiquarkus.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SampleOTO")
public class SampleOTO {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "sample_one_id")
    private SampleOne sampleOne;

    @OneToOne
    @JoinColumn(name = "sample_two_id")
    private SampleTwo sampleTwo;

    public SampleOTO() {
        // Evitar problemas
    }

    public SampleOTO(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SampleOne getSampleOne() {
        return sampleOne;
    }

    public void setSampleOne(SampleOne sampleOne) {
        this.sampleOne = sampleOne;
    }

    public SampleTwo getSampleTwo() {
        return sampleTwo;
    }

    public void setSampleTwo(SampleTwo sampleTwo) {
        this.sampleTwo = sampleTwo;
    }

}
