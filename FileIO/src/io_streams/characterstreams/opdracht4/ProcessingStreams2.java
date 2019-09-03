package io_streams.characterstreams.opdracht4;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//BufferedWriter writer = Files.newBufferedWriter(new FileWriter("MyFile.txt",true)) also works

public class ProcessingStreams2 {
    public static void main(String[] args) {
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("MyFile.txt"), StandardOpenOption.APPEND)){
            writer.write("Hurb");
            writer.newLine();
            writer.write("Durb");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
