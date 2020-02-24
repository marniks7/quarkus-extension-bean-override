package io.quarkus.it.my.ext;

import io.quarkus.my.ext.Policy;

public class TestPolicy implements Policy {
    @Override
    public String doSomething() {
        return "test";
    }
}
