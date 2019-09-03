package io_streams.characterstreams;

import java.io.*;

public class DataToFile {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("MyFile.txt", true)){
            writer.write("Hurb");
            writer.write("Durb");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
