package main;

import java.util.stream.IntStream;

public class StreamApp02 {
    public static void main(String[] args) {
        IntStream stroompje = IntStream.rangeClosed(0,99);
        stroompje.forEach(System.out::println);
    }
}
