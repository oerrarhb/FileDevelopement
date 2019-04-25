package testing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		
		// Solution of reading from a file and displaying to console
		
		
		String path = "C:\\Users\\Lenovo\\Desktop\\test1.txt";
		try {
			
			FileReader fr = new FileReader(path);
			StringBuilder strb = new StringBuilder();
			char[] tab_char = new char[1];
			int n = 0;
			
			while((n= fr.read(tab_char))>0)
			{
				strb.append(tab_char, 0, n);	
			}
			System.out.println("The content of the file is :");
			System.out.println(strb.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
