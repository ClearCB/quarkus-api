package edu.craptocraft.finalapiquarkus.repository;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleMTO;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class RepositorySampleMTO implements PanacheRepository<SampleMTO> {

    public List<SampleMTO> listAllSample() {
        return listAll();

    }

    public Optional<SampleMTO> getSample(long id) {
        return find("id", id).firstResultOptional();
    }

    @Transactional
    public void deleteSample(SampleMTO sampleMTO) {

        delete("id", sampleMTO.getId());

    }

    @Transactional
    public SampleMTO createSample(SampleMTO sampleMTO) {

        persist(sampleMTO);
        return sampleMTO;
    }
}
