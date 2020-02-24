package io.quarkus.it.my.ext;

import io.quarkus.my.ext.Policy;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class TestConfiguration {

    @Produces
    public Policy quarkusPolicy() {
        return new TestPolicy();
    }
}
