package io_streams.characterstreams.opdracht4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessingStreams {
    public static void main(String[] args) {
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("MyFile.txt"))){
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
