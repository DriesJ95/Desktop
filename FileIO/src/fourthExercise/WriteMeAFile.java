package fourthExercise;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMeAFile {
    public static void main(String[] args) {
        try{

            Path path = Paths.get("C:/Users/Dries/Desktop/testing.txt");

            checkIfDirExistElseCreate(path);

            checkIfFileExistElseCreate(path);

            writeSomeLinesToFile(path);

            Files.lines(path).forEach(System.out::println);

            Files.copy(path, Paths.get("C:/Users/Dries/Desktop/testing2.txt"));
            System.out.println("Copy is created.");

            String feedback = (Files.deleteIfExists(path)) ? "Deleted." : "Non existing";
            System.out.println("The file is: " + feedback);

        }catch(IOException e){
            System.out.println("Whoops: " + e.getMessage());
        }
    }

    private static void writeSomeLinesToFile(Path path) throws IOException {
        if (path != null) {
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("from");
            lines.add("the");
            lines.add("other");
            lines.add("side");
            Files.write(path,lines, Charset.defaultCharset(), StandardOpenOption.APPEND);
        }
    }

    private static void checkIfFileExistElseCreate(Path path) throws IOException{
        if (Files.notExists(path)){
            Files.createFile(path);
            System.out.println("File is created!");
        }else{
            System.out.println("File already exists.");
        }
    }

    private static void checkIfDirExistElseCreate(Path path) throws IOException {
        if (Files.notExists(path.getParent())){
            Files.createDirectories(path.getParent());
            System.out.println("Dir is created!");
        }else{
            System.out.println("Dir already exists.");
        }
    }


}
