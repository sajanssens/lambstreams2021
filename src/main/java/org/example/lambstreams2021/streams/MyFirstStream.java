package org.example.lambstreams2021.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MyFirstStream {

    public List<String> startsWith(List<String> names, String start) {
        // HOE??
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(start)) {
                result.add(name);
            }
        }
        return result;
    }

    public List<String> startsWith2(List<String> names, String start) {
        // WAT??
        return names.stream()
                .filter(e -> e.startsWith(start))
                .collect(toList());
    }

    public void examples() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1"); // stream source

        List<String> result = new ArrayList<>();

        String s1 = myList.stream()
                // .filter(s -> s.startsWith("c")) // intermediary operation
                // .map(String::toUpperCase)
                // .sorted()
                // .forEach(s -> result.add(s)); // terminal operation.
                .collect(Collectors.joining(" -- "));// terminal operation.

        System.out.println(s1);

        int sum1 = myList.stream()
                .map(s -> s.charAt(1))
                .map(c -> Integer.parseInt(c + ""))
                .mapToInt(Integer::intValue)
                .sum(); // terminal operation specific for IntStream
        // .reduce(Integer::sum);

        // Integer sum = optSum.orElse(0);
        // System.out.println(sum);



    }


}
