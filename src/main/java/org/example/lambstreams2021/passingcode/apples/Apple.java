package org.example.lambstreams2021.passingcode.apples;

public class Apple {
    private final String color;
    private final int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Apple Color: " + color + ", Weight: " + weight;
    }
}
