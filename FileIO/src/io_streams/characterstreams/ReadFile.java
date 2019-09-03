package io_streams.characterstreams;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileReader file = new FileReader("MyFile.txt")) {
            int character;
            while ((character = file.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
