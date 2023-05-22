package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleMTO;
import edu.craptocraft.finalapiquarkus.repository.RepositorySampleMTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicesSampleMTO {

    @Inject
    RepositorySampleMTO repositoryMTO;

    public ServicesSampleMTO() {
        // Evitar problemas
    }

    public List<SampleMTO> list() {

        return repositoryMTO.listAllSample();
    }

    public void add(SampleMTO sample) {

        repositoryMTO.createSample(sample);
    }

    public void remove(SampleMTO sample) {

        repositoryMTO.deleteSample(sample);
    }

    public Optional<SampleMTO> getSample(long id) {

        return repositoryMTO.getSample(id).isPresent()
                ? repositoryMTO.getSample(id)
                : Optional.ofNullable(null);
    }
}
