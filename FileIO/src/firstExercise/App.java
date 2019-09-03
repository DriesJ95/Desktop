package firstExercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {

        /*
        We start by making an instance of the Path interface
         */

        Path p1 = Paths.get("C:/users/dries/desktop");
        Path p2 = p1.resolve("C:/users/dries/desktop/file");
        Path p3 = p2.resolve("testing.txt");
        Path p4 = p1.resolve("testing.txt").resolve("zekergeenwachtwoord.txt");
        Path p5 = p3.relativize(p4);

        isAbsolutePath(p1);
        isAbsolutePath(p2);
        isAbsolutePath(p3);
        isAbsolutePath(p4);
        isAbsolutePath(p5);

        try{
            Path path = Paths.get("C:/data/folder/zaeqsdq");
            System.out.println("The root is: " + path.getRoot());
            System.out.println("Filename: " + path.getFileName());
            System.out.println("Get parent path: " + path.getParent());
            System.out.println("\nOw boi, we have the foreach method\n");
            path.forEach(System.out::println);
            path.toRealPath();
        }catch(IOException e){
            System.err.println("Whoops " + e.getMessage());
        }
    }

    private static void isAbsolutePath(Path p){
        System.out.println(p.toAbsolutePath() + " is an absolute path: " + p.isAbsolute());
    }
}
