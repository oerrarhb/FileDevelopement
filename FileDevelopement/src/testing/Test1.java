package testing;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solution of copying from the code to the file
		String str = "Othmane is developing a Solution of copying from the code to the file";
		String path = "C:\\Users\\Lenovo\\Desktop\\test3.txt";
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(path)));

				try {
					dos.writeChars(str);
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
