package io.quarkus.my.ext;

import io.quarkus.arc.DefaultBean;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class MyExtConfiguration {

    @Produces
    @DefaultBean
    public Policy quarkusPolicy() {
        return new DefaultPolicy();
    }
}
