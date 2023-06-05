package edu.craptocraft.onequarkusapp.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.onequarkusapp.models.Item;
import edu.craptocraft.onequarkusapp.models.Orden;
import edu.craptocraft.onequarkusapp.models.Usuaria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ServiceOlli {

    public Usuaria cargaUsuaria(String nombreUsuario) {

        Optional<Usuaria> usuario = Usuaria.findByIdOptional(nombreUsuario);

        return usuario.isEmpty()
                ? new Usuaria("", 0)
                : usuario.get();
    }

    public Item cargaItem(String nombreUsuario) {

        Optional<Item> usuario = Item.findByIdOptional(nombreUsuario);

        return usuario.isEmpty()
                ? new Item("", 0)
                : usuario.get();
    }

    public List<Orden> cargaOrden(String nombreUsuario) {

        List<Orden> ordenes = Orden.list("usuaria.nombre", nombreUsuario);
        return ordenes;

    }

    @Transactional
    public Orden comanda(String nombreUsuario, String nombreItem) {

        Orden orden = null;
        Usuaria usuario = Usuaria.findById(nombreUsuario);
        Item item = Item.findById(nombreItem);

        orden = new Orden(usuario, item);
        orden.persist();
        return orden;
    }
}
