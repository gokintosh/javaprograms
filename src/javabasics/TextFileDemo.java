package javabasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileDemo {
	public static void main(String[] args) {
		Scanner fileIn = null;  //Initialises fileIn to empty
		try {
//			attempt to open a file
			fileIn=new Scanner(new FileInputStream("C:\\Users\\gokul\\Desktop\\sql.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
			System.exit(0);
		}
		
		int highScore;
		String name;
		
		System.out.println("Text left to read"+fileIn.hasNextLine());
//		highScore=fileIn.nextInt();
//		fileIn.nextLine();
		name=fileIn.nextLine();
		
		System.out.println("the name is :"+name);
//		System.out.println("the high score is"+highScore);
		System.out.println("the text left to read:"+fileIn.hasNextLine());
		
		fileIn.close();
		
		
		
		
		}
	
	
		

}
