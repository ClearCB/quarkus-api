package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleOTO;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RepositorySampleOTO implements PanacheRepository<SampleOTO> {

    public List<SampleOTO> listAllSample() {
        return listAll();

    }

    public Optional<SampleOTO> getSample(long id) {
        return find("id", id).firstResultOptional();
    }

    @Transactional
    public void deleteSample(SampleOTO sampleMTO) {

        delete("id", sampleMTO.getId());

    }

    @Transactional
    public SampleOTO createSample(SampleOTO sampleMTO) {

        persist(sampleMTO);
        return sampleMTO;
    }
}
