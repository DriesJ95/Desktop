package main2;

import java.math.BigDecimal;

public class TextApp2 {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("This is an example of a sentence");

        tp.printProcessedWords(new TextScrambler()::scramble);
        System.out.println("---------------------");

        tp.printProcessedWords(String::toLowerCase);

        System.out.println("---------------------");
        TextPrinter tp1 = new TextPrinter("4 8 9 10 234");
        tp1.printNumberValues(BigDecimal::new);
    }
}
