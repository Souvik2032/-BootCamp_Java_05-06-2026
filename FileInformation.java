package fileConcept;

import java.io.File;
import java.io.IOException;

public class FileInformation {

    public static void main(String[] args) {
            File obj = new File("C:\\TextFolder_Souvik\\Sou.txt");

            if (obj.exists()) {
                System.out.println("File name: " +obj.getName());
                System.out.println("Absolute Path" +obj.getAbsolutePath());
                System.out.println("Writable: " +obj.canWrite());
                System.out.println("Readable: " +obj.canRead());
                System.out.println("File size in bytes: " +obj.length());
            }else{
                System.out.println("File is no more");
            }
        }
    }

