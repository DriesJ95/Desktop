import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectApp {
    public static void main(String[] args) {
        String text = "this is some text.";
        String text2 = "this is some text too.";
        try(FileOutputStream file = new FileOutputStream("MyFile.ser");
            ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(text);
            out.writeObject(text2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
