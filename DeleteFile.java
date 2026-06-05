package fileConcept;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

    public static void main(String[] args) {
            File obj = new File("C:\\TextFolder_Souvik\\Sou.txt");

            if (obj.delete()) {
                System.out.println("File deleted: " +obj.getName());
            }else{
                System.out.println("File is no more");
            }
        }
    }

