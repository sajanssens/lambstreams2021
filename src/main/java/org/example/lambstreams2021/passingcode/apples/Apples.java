package org.example.lambstreams2021.passingcode.apples;

import java.util.ArrayList;
import java.util.List;

public class Apples {

    // DRY = Don't Repeat Yourself!

    public List<Apple> findApples(List<Apple> apples, AppleCondition condition) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (condition.evaluate(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public int doeIets() {
        return (int) (Math.random() * 1000);
    }

}
