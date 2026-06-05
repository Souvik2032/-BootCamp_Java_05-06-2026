package fileConcept;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter obj= new FileWriter("C:\\TextFolder_Souvik\\Sou.txt");
			obj.write("Trainer is just awsome");
			obj.close();
			System.out.println("Code ran successfully");
		}catch(IOException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}

	}

}
