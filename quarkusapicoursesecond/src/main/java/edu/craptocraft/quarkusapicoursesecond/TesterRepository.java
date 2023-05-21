package edu.craptocraft.quarkusapicoursesecond;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.transaction.Transactional;

public class TesterRepository implements PanacheRepository<Tester> {

    @Transactional
    public Tester create(Tester developer) {
        persist(developer);
        return developer;
    }

    public Tester findByName(String name) {
        return find("name", name).firstResult();
    }
}
