package opdracht5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.DeflaterOutputStream;

public class ByteStreams {
    public static void main(String[] args) {
        try (PrintStream printerke = new PrintStream(new DeflaterOutputStream(new FileOutputStream("MyFile.txt")))){
            for(int i = 0; i < 1000; i++){
                printerke.println("How you doin'?");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
