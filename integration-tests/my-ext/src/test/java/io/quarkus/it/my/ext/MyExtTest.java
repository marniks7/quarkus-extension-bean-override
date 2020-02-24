package io.quarkus.it.my.ext;

import io.quarkus.my.ext.MyExtConfiguration;
import io.quarkus.my.ext.Policy;
import io.quarkus.test.QuarkusUnitTest;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

public class MyExtTest {

    @RegisterExtension
    static final QuarkusUnitTest config = new QuarkusUnitTest()
            .setArchiveProducer(() ->
                    ShrinkWrap.create(JavaArchive.class)
                            .addClasses(MyExtConfiguration.class, TestConfiguration.class)
            );

    @Inject
    Policy quarkusPolicy;

    @Test
    public void test() {
        assertThat(quarkusPolicy.doSomething()).isEqualTo("test");
    }

}
