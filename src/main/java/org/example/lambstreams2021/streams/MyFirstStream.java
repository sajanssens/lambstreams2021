package org.example.lambstreams2021.streams;

import java.util.ArrayList;
import java.util.List;

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
}
