package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleAR;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RepositorySampleAR implements PanacheRepository<SampleAR> {

    public RepositorySampleAR() {
        // Evitar problemas
    }

    public List<SampleAR> listAllSample() {
        return SampleAR.listAll();

    }

    public Optional<SampleAR> getSample(long id) {
        return SampleAR.find("id", id).firstResultOptional();
    }

    @Transactional
    public void deleteSample(SampleAR sample) {

        SampleAR.delete("id", sample.getId());
    }

    @Transactional
    public void createSample(SampleAR sample) {

        SampleAR.persist(sample);
    }
}
