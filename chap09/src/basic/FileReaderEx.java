package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		try {
			FileReader input = new FileReader("/Users/Yenniii/Desktop/test.rtf");
			
			int c;
			while ((c = input.read()) == -1) {
				System.out.println((char)c);
			}
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
