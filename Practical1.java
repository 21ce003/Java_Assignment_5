// Prepared by HARIL ANKLESHWARIYA 21CE003
// WAP to show how to create a file with different mode and methods of File class to find
// path, directory etc.
import java.io.*;

public class Practical1 {
    public static void main(String[] args) {

        String path = "";
        boolean bool = false;
        try {
            // creating new files
            File file1 = new File("TestFile1.txt");
            file1.createNewFile();
            System.out.println(file1);
            // creating new canonical from file object
            File file2 = file1.getCanonicalFile();
            // returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();
            // returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);
            // if file exists
            if (bool) {
                // prints
                System.out.print(path + bool);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
