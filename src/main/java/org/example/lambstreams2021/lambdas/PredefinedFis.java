package org.example.lambstreams2021.lambdas;

import java.util.function.*;

public class PredefinedFis {

    public static void main(String[] args) {
        IntBinaryOperator f1 = (a, b) -> a + b;
        LongBinaryOperator f2 = (a, b) -> a + b;

        Consumer<Integer> c = any -> {};
        IntConsumer ic = any -> {};

        Function<Double, String> fn = d -> "";
        DoubleFunction<String> fn2 = d -> "";

        Function<Integer, String> lam = (Integer i) -> "UIT";
        IntFunction<String> lam2 = (int i) -> "UIT";

        BiFunction<String, String, Long> f3 = (String a, String b) -> 42l;
        BinaryOperator<String> f4 = (String a, String b) -> a + b;

        // Predicate
        // T->boolean
        // (Person p) -> p.getName()!=null;
        // (String s) -> s!=null;
        Predicate<String> pr = s -> s.isEmpty();

        Supplier<Double> sup = () -> (double) 'a';
        DoubleSupplier sup2 = () -> 'a';

        char a = 'a'; // ASCII van a
        char b = 'a' + 1; // (ASCII van a) + 1
        System.out.println(b);
        for (int i = 0; i < 26; i++) {
            System.out.println(a++);
        }

    }

}
