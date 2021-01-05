package org.example.lambstreams2021.lambdas;

import java.util.function.Function;

public class MyFirstLambda {

    public long kwadrateer(Integer arg) {

        // f(x) = x^2
        // f(3) = 9

        // .. -> ..

        Function<Integer, Long> f = x -> (long) x * x; // type: "functie van Integer naar Long"

        // int result = sqr(3);
        return f.apply(arg); // Long --> long: auto UNboxing
    }

    private int sqr(int x) {
        return x * x;
    }

}
