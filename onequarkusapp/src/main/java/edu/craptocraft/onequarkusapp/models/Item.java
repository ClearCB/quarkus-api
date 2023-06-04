package edu.craptocraft.onequarkusapp.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "t_items")
public class Item extends PanacheEntityBase {

    @Id
    @Column(name = "item_nom")
    private String nombre;

    @Column(name = "item_prop")
    private int quality;

    @Column(name = "item_tipo")
    private String tipo;

    public Item() {
    }

    public Item(String nombre, int quality) {
        this.nombre = nombre;
        this.quality = quality;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getTipo() {
        return tipo;
    }

}
