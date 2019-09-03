package main;

import java.util.stream.IntStream;

public class StreamApp4 {
    public static void main(String[] args) {
        IntStream stroompje = IntStream.rangeClosed(0,40);

        System.out.println(stroompje.count());
        stroompje = IntStream.rangeClosed(0,40);
        System.out.println(stroompje.max());
        stroompje = IntStream.rangeClosed(0,40);
        System.out.println(stroompje.min());
        stroompje = IntStream.rangeClosed(0,40);
        System.out.println(stroompje.average());
        stroompje = IntStream.rangeClosed(0,40);
        System.out.println(stroompje.sum());
        stroompje = IntStream.rangeClosed(0,40);
        System.out.println(stroompje.reduce(0,(acc,el) -> acc+(el*el)));
    }
}
