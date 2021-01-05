package org.example.lambstreams2021.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MyFirstStreamTest {

    private MyFirstStream target = new MyFirstStream();

    @Test
    void startsWith() {
        List<String> strings = target.startsWith(List.of("Jeroen", "Bram", "Gijs"), "J");
        assertThat(strings).contains("Jeroen");
    }
}
