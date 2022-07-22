package File_Handling;

import java.io.*;
import java.util.*;

public class file_hadling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// Create
		/*
		 * try { File myObj = new File("data/input.txt"); if (myObj.createNewFile()) {
		 * System.out.println("File created: " + myObj.getName()); } else {
		 * System.out.println("File already exists."); } } catch (IOException e) {
		 * System.out.println("An error occurred."); e.printStackTrace(); }
		 */
		// Write
		/*
		 * try { FileWriter myWriter = new FileWriter("data/input.txt");
		 * myWriter.write("Files in Java might be tricky, but it is fun enough!");
		 * myWriter.close(); System.out.println("Successfully wrote to the file."); }
		 * catch (IOException e) { System.out.println("An error occurred.");
		 * e.printStackTrace(); }
		 */
		// Read
		//File myFile=new File("data/input.txt");
		InputStream myFile=new FileInputStream("data/input.txt");
		//Scanner sc=new Scanner(myFile);
		System.setIn(myFile);
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		System.out.println(data);

	}

}
