package edu.craptocraft.onequarkusapp.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_users")
public class Usuaria extends PanacheEntityBase {

    @Id
    @Column(name = "user_nom")
    private String nombre;

    @Column(name = "user_prop")
    private long destreza;

    public Usuaria() {
    }

    public Usuaria(String nombre) {
        this.nombre = nombre;
    }

    public Usuaria(String nombre, long destreza) {
        this.nombre = nombre;
        this.destreza = destreza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDestreza() {
        return destreza;
    }

    public void setDestreza(long destreza) {
        this.destreza = destreza;
    }

}
