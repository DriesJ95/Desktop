package io_streams.characterstreams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileApp {
    public static void main(String[] args) {

        try (FileWriter fileW = new FileWriter("MyFile.txt")){
            ;
            fileW.write("Hello");
            fileW.write("World");
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }

    }

}

