package secondExercise;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class App2 {
    public static void main(String[] args) {
        //We will make 2 path objects (concerning unexisting paths)

        Path p1 = Paths.get("C:/users/poopie");
        Path p2 = Paths.get("C:/users/dookie");

        /*
        We can compare 2 objects lexicographically
        Returns:

        0:                  if argument is equal to this path
        less than zero:     if the path is lexicographically less than the argument
        more than zero:     if the path is lexicograpically more than the argument

         */

        System.out.println(p1.compareTo(p2));

        System.out.println();

        /*
        Iterating the path
        */

        for (Path p: p1){
            System.out.println(p);
        }

        System.out.println();

        /*
        Or we can do it like this
        */

        Iterator it = p2.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Or do it like the pro's

        System.out.println();
        p1.forEach(System.out::println);

        // We can check if we are working with the correct file

        System.out.println("This is the file.txt file: " + p1.endsWith("file.txt") + "\n");

        // And check if it's on the right partition

        System.out.println("This file is on the C drive: " + p1.startsWith("C:/"));
    }
}
