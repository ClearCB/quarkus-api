package edu.craptocraft.finalapiquarkus.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import edu.craptocraft.finalapiquarkus.models.SampleAR;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicesSampleAR {

    public List<SampleAR> list() {

        Stream<SampleAR> samples = SampleAR.streamAll();
        return samples.toList();
    }

    public void add(SampleAR sample) {

        sample.persist();
    }

    public void remove(long id) {

        SampleAR sampleAR = SampleAR.find("id", id).firstResult();
        sampleAR.delete();
    }

    public Optional<SampleAR> getSample(long id) {

        return SampleAR.find("id", id).firstResultOptional();
    }
}
