package edu.craptocraft;

import java.util.HashMap;
import java.util.Map;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

/**
 * HellowordlQuarkusTestResourceLifeCycleManager
 */
public class HellowordlQuarkusTestResourceLifeCycleManager implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        System.out.println("Iniciando casos test");
        Map<String, String> conf = new HashMap<>();
        conf.put("greetings.message", "Aloha Test");
        return conf;
    }

    @Override
    public void stop() {
        System.out.println("Casos test ejecutados");
    }

}