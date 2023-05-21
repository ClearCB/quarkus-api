package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.Sample;
import edu.craptocraft.finalapiquarkus.models.SampleAR;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RepositorySampleAR implements PanacheRepository<Sample> {

    public RepositorySampleAR() {
        // Evitar problemas
    }

    public List<Sample> listAllSample() {
        return SampleAR.listAll();

    }

    public Optional<Sample> getSample(long id) {
        return SampleAR.find("id", id).firstResultOptional();
    }

    public void deleteSample(Sample sample) {

        SampleAR.delete("id", sample.getId());
    }

    public void createSample(Sample sample) {

        SampleAR.persist(sample);
    }
}
