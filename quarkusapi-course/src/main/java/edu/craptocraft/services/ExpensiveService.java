package edu.craptocraft.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExpensiveService implements IExpensiveService {

    @Override
    public int calculate() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1000;
    }
}
