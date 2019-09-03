package main;

public class TextApp {

    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("Words containing 2 'e'");
        tp.printFilteredWords((String s) -> containsDoubleE(s));
    }


    public static boolean containsDoubleE(String s) {
        boolean flag = false;
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (c == 'e') {
                counter++;
                if (counter > 1) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
