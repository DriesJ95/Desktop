package main2;

public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor processor){
        for (String w : sentence.split(" ")){
            System.out.println(processor.process(w));
        }
    }

    public void printNumberValues(NumberParser parser){
        for (String s : sentence.split(" ")){
            System.out.println(parser.parse(s));
        }
    }
}
