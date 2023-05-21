package edu.craptocraft.quarkusapicoursesecond;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.transaction.Transactional;

public class PlayerRepository implements PanacheRepository<Player> {

    @Transactional
    public Player create(Player developer) {
        persist(developer);
        return developer;
    }

    public Player findByName(String name) {
        return find("name", name).firstResult();
    }
}
