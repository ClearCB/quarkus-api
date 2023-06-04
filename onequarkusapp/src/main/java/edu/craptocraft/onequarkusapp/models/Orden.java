package edu.craptocraft.onequarkusapp.models;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_ordenes")
public class Orden extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "ord_user")
    private Usuaria usuaria;

    @ManyToOne
    @JoinColumn(name = "ord_item")
    private Item item;

    public Orden() {
    }

    public Orden(Usuaria usuaria, Item item) {
        this.usuaria = usuaria;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setOrdenId(Long id) {
        this.id = id;
    }

    public Usuaria getUser() {
        return usuaria;
    }

    public void setUser(Usuaria usuaria) {
        this.usuaria = usuaria;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
