package org.example.lambstreams2021.passingcode.apples;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ApplesTest {

    Apples target = new Apples();

    @Test
    void findApples() {

        List<Apple> apples = AppleStock.appleList();

        target.findApples(apples, a -> "red".equals(a.getColor()));
        target.findApples(apples, a -> "green".equals(a.getColor()));
        target.findApples(apples, a -> a.getWeight() >= 150);

        System.out.println(target.findApples(apples, a -> a.getWeight() >= 150 && "red".equals(a.getColor())));

        Apple p = new Apple("p", 100);

        boolean success = apples.add(p);

        List<Apple> copy = new ArrayList<>();
        apples.stream().forEach(a -> copy.add(a)); // void compatibility rule
    }

    @Test
    void doeNietsMetDoeIets() {
        target.doeIets(); // statement expression

    }
}
