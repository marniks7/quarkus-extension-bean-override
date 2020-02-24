package io.quarkus.my.ext;

public class DefaultPolicy implements Policy {

    @Override
    public String doSomething() {
        return "default";
    }
}
