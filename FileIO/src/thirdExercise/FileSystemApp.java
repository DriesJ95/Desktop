package thirdExercise;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipalLookupService;

public class FileSystemApp {

    public static void main(String[] args) {
        /*
        Filesystem is the factory for objects to access
        files and other objects in the file system
        */

        FileSystem fsystem = FileSystems.getDefault();

        /*
        We can use the method getSeperator
        To see what seperates the different parts of the path
         */

        System.out.println("Seperated by: " + fsystem.getSeparator());

        /*
        Show me your roots baby
         */

        fsystem.getRootDirectories().forEach(root -> System.out.println("Root: " + root));

        /*
        Checking if our object is read-only
         */

        System.out.println("System is read-only: " + fsystem.isReadOnly());

        /*
        What are the supported access levels
         */

        System.out.println("Access levels on root: ");
        fsystem.supportedFileAttributeViews().forEach(System.out::println);

        /*
        Service to search the user
         */

        UserPrincipalLookupService usrLookup = fsystem.getUserPrincipalLookupService();
        try{
            System.out.println("Check out this user: " + usrLookup.lookupPrincipalByName("Dries"));
        }catch(Exception e){
            System.err.println("Whoops: " + e.getMessage());
        }
    }
}
