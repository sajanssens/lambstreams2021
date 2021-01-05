package org.example.lambstreams2021.lambdas;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyFirstLambdaTest {

    private MyFirstLambda target = new MyFirstLambda();

    @Test
    void kwadrateer() {
        long kwadrateer = target.kwadrateer(3); // auto boxing; int --> Integer
        assertThat(kwadrateer).isEqualTo(9);
    }
}
