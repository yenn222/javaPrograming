package library;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) {
		try(PrintWriter print = new PrintWriter(new FileWriter("books2.txt"));){
//			PrintWriter print = new PrintWriter(new FileWriter("books2.txt"));
			print.println("Java Programming, Gildong Hong, 2023, 10000, true");
			
			String title = "Java Programming";
			String author = "Gildong Hong";
			int year = 2023;
			int price = 10000;
			boolean renting = false;
			
			print.println(title + ", " + author + ", " + year + ", " + price + ", " + renting);
			
			print.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
