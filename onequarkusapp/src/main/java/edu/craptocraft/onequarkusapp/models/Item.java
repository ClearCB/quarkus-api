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
    @NotBlank
    private String nombre;

    @Column(name = "item_prop")
    private long quality;

    @Column(name = "item_tipo")
    private String tipo;

    public Item() {
    }

    public Item(@NotBlank String nombre, int quality, String tipo) {
        this.nombre = nombre;
        this.quality = quality;
        this.tipo = tipo;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
