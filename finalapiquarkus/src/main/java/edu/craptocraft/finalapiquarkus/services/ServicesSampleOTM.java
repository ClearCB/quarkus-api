package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleOTM;
import edu.craptocraft.finalapiquarkus.repository.RepositorySampleOTM;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicesSampleOTM {

    @Inject
    RepositorySampleOTM repositoryOTM;

    public ServicesSampleOTM() {
        // Evitar problemas
    }

    public List<SampleOTM> list() {

        return repositoryOTM.listAllSample();
    }

    public void add(SampleOTM sample) {

        repositoryOTM.createSample(sample);
    }

    public void remove(SampleOTM sample) {

        repositoryOTM.deleteSample(sample);
    }

    public Optional<SampleOTM> getSample(long id) {

        return repositoryOTM.getSample(id).isPresent()
                ? repositoryOTM.getSample(id)
                : Optional.ofNullable(null);
    }
}
