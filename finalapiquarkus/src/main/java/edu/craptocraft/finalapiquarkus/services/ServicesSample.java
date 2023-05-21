package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.Sample;
import edu.craptocraft.finalapiquarkus.repository.RepositorySample;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicesSample {

    @Inject
    RepositorySample repository;

    public ServicesSample() {
        // Evitar problemas
    }

    public List<Sample> list() {

        return repository.listAllSample();
    }

    public Sample add(Sample sample) {

        return repository.createSample(sample);
    }

    public void remove(Sample sample) {

        repository.deleteSample(sample);
    }

    public Optional<Sample> getSample(long id) {

        return repository.getSample(id).isPresent()
                ? repository.getSample(id)
                : Optional.ofNullable(null);
    }
}
