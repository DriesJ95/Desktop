package io_streams.characterstreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("MyFile.txt"))){
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException ex){
            System.err.println("Oops, something went wrong!");
            System.err.println(ex.getMessage());
        }
    }
}
