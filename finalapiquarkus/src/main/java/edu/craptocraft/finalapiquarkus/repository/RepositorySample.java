package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.Sample;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RepositorySample implements PanacheRepository<Sample> {

    public List<Sample> listAllSample() {
        return listAll();

    }

    public Optional<Sample> getSample(long id) {
        return find("id", id).firstResultOptional();
    }

    @Transactional
    public void deleteSample(Sample sample) {

        delete("id", sample.getId());

    }

    @Transactional
    public Sample createSample(Sample sample) {

        persist(sample);
        return sample;
    }
}
