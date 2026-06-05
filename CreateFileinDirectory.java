package fileConcept;

import java.io.File;
import java.io.IOException;

public class CreateFileinDirectory {

    public static void main(String[] args) {
        try {
            File obj = new File("C:\\TextFolder_Souvik\\Sou.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " +obj.getName());
                System.out.println("Path: " +obj.getAbsolutePath());
            }else{
                System.out.println("File already exists");
            }

        }catch(IOException e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
