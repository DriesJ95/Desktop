import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectApp {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("MyFile.ser");
            ObjectInputStream in = new ObjectInputStream(file)){
            String text1 = (String) in.readObject();
            String text2 = (String) in.readObject();
            System.out.println(text1);
            System.out.println(text2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
