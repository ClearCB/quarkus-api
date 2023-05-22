package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleAR;
import edu.craptocraft.finalapiquarkus.repository.RepositorySampleAR;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicesSampleAR {

    @Inject
    RepositorySampleAR repositoryAR;

    public ServicesSampleAR() {
        // Evitar problemas
    }

    public List<SampleAR> list() {

        return repositoryAR.listAllSample();
    }

    public void add(SampleAR sample) {

        repositoryAR.createSample(sample);
    }

    public void remove(SampleAR sample) {

        repositoryAR.deleteSample(sample);
    }

    public Optional<SampleAR> getSample(long id) {

        return repositoryAR.getSample(id).isPresent()
                ? repositoryAR.getSample(id)
                : Optional.ofNullable(null);
    }
}
