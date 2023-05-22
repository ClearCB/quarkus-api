package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleOTM;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RepositorySampleOTM implements PanacheRepository<SampleOTM> {

    public List<SampleOTM> listAllSample() {
        return listAll();

    }

    public Optional<SampleOTM> getSample(long id) {
        return find("id", id).firstResultOptional();
    }

    @Transactional
    public void deleteSample(SampleOTM sampleOTM) {

        delete("id", sampleOTM.getId());

    }

    @Transactional
    public SampleOTM createSample(SampleOTM sampleOTM) {

        persist(sampleOTM);
        return sampleOTM;
    }
}
