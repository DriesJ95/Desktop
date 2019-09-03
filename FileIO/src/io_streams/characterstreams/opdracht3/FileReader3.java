package io_streams.characterstreams.opdracht3;

import java.io.FileReader;
import java.io.IOException;

public class FileReader3 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("MyFile.txt")){
            int character;
            while ((character = reader.read()) != -1){
                System.out.println((char)character);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
