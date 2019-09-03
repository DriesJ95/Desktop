package opdracht5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class ByteStreams2 {
    public static void main(String[] args) {
        try (BufferedReader source = new BufferedReader(
                new InputStreamReader(
                        new InflaterInputStream(
                                new FileInputStream("MyFile.txt")
                        )
                )
        )) {
            String line = null;
            while ((line = source.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
