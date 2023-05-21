package edu.craptocraft.quarkusapicoursesecond;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Developer
 */
@Entity
public class Player extends PanacheEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    @Column
    private Integer age;

}