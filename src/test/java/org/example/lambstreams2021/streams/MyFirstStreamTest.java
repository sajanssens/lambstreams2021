package org.example.lambstreams2021.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.example.lambstreams2021.streams.ExampleCollections.persons;

class MyFirstStreamTest {

    private MyFirstStream target = new MyFirstStream();

    @Test
    void startsWith() {
        List<String> strings = target.startsWith(List.of("Jeroen", "Bram", "Gijs"), "J");
        assertThat(strings).contains("Jeroen");
    }

    @Test
    void examples() {
        target.examples();
    }

    @Test
    void flatMap() {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                result.add(i);
            }
        }
        System.out.println(result);

        Stream.of(1, 2, 3, 4) // voor elk element, doe iets...
                .flatMap(i -> Stream.of(i, i)) // iteratie in een iteratie
                .forEach(System.out::println);
    }

    @Test
    void name() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    @Test
    void noCombiner() {
        Integer ageSum = persons
                .parallelStream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1 + sum2;
                        });
        System.out.println(ageSum);  // 76
    }
}
