package edu.craptocraft.quarkusapicoursesecond;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Developer
 */
@Entity
public class Tester extends PanacheEntity {

    @Column(unique = true)
    public String name;

    @Column
    public Integer age;

}