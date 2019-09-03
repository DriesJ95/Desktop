package main;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp01 {
    public static void main(String[] args) {
        int[] integerArray = new int[]{8,9,13,15,19,23};
        IntStream.of(integerArray).forEach(System.out::println);
    }
}
