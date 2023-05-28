package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleOTO;
import edu.craptocraft.finalapiquarkus.repository.RepositorySampleOTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicesSampleOTO {

    @Inject
    RepositorySampleOTO repositoryMTO;

    public ServicesSampleOTO() {
        // Evitar problemas
    }

    public List<SampleOTO> list() {

        return repositoryMTO.listAllSample();
    }

    public void add(SampleOTO sample) {

        repositoryMTO.createSample(sample);
    }

    public void remove(SampleOTO sample) {

        repositoryMTO.deleteSample(sample);
    }

    public Optional<SampleOTO> getSample(long id) {

        return repositoryMTO.getSample(id).isPresent()
                ? repositoryMTO.getSample(id)
                : Optional.ofNullable(null);
    }
}
