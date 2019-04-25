package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution of copying from file to another
		
		
		String path1 = "C:\\Users\\Lenovo\\Desktop\\test1.txt";
		String path2 = "C:\\Users\\Lenovo\\Desktop\\test2.txt";
		try {
			FileInputStream fis = new FileInputStream(new File(path1));
			FileOutputStream fos = new FileOutputStream(new File(path2));
			byte[] tab_bytes = new byte[1];
			
			while(fis.read(tab_bytes)>0)
			{
				fos.write(tab_bytes);
			}
			
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
