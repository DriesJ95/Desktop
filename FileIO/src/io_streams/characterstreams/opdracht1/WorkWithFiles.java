package io_streams.characterstreams.opdracht1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFiles {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/Dries/Desktop/SECRET/testtext.txt");
        try {
            checkIfDirExistElseCreate(path);

            checkIfFileExistElseCreate(path);

            writeSomeLinesToFile(path);

            getFileCharacteristics(path);

            getFileContents(path);

            Files.move(path,Paths.get("C:/Users/Dries/Desktop/SECRET/koeren.txt"));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void getFileContents(Path path) throws IOException {
        if (path != null){
            System.out.println("------------------------------------------------");
            System.out.println("FILE CONTENTS:");
            System.out.println("--------------");
            Files.lines(path).forEach(System.out::println);
            System.out.println("------------------------------------------------");
        }else{
            System.out.println("Path doesn't exist");
        }
    }

    private static void getFileCharacteristics(Path path) throws IOException{
        if (path != null){
            DosFileAttributes chars = Files.readAttributes(path,DosFileAttributes.class);
            System.out.println("------------------------------------------------");
            System.out.println("FILE ATTRIBUTES:");
            System.out.println("----------------");
            System.out.println("Size: " + chars.size() + " bytes");
            System.out.println("Creation Time: " + chars.creationTime());
            System.out.println("Last Accessed: " + chars.lastAccessTime());
            System.out.println("Last Modified: " + chars.lastModifiedTime());
            System.out.println("Is Archived: " + chars.isArchive());
            System.out.println("Is Hidden: " + chars.isHidden());
            System.out.println("Is Read Only: " + chars.isReadOnly());
            System.out.println("Owner: " + Files.getOwner(path));
            System.out.println("------------------------------------------------");
        }
    }

    private static void writeSomeLinesToFile(Path path) throws IOException {
        if (path != null){
            List<String> woordenLijst = new ArrayList<>();
            woordenLijst.add("Karen");
            woordenLijst.add("Riekt");
            woordenLijst.add("Naar");
            woordenLijst.add("Poepoe");
            Files.write(path, woordenLijst, Charset.defaultCharset(), StandardOpenOption.APPEND);
        }
    }

    private static void checkIfFileExistElseCreate(Path path) throws IOException{
        if (path != null){
            if (!Files.exists(path)){
                Files.createFile(path);
                System.out.println("File created.");
            }else{
                System.out.println("File already exists");
            }
        }
    }

    private static void checkIfDirExistElseCreate(Path path) throws IOException {
        if (path != null) {
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
                System.out.println("Directory created.");
            } else {
                System.out.println("Directory already exists.");
            }
        }
    }
}
