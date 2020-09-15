package javabasics;

import java.util.Scanner;

public class consoleInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		
		
		System.out.println("Enter the number of pods followed by");
		System.out.println("the number of peas in the pod !");
		int numberOfPods=keyboard.nextInt();
		int numberOfPeas=keyboard.nextInt();
		
		System.out.println("enter a one digit number!");
		int n1=keyboard.nextInt();
		
		int totalNumberOfPeas=numberOfPods*numberOfPeas;
		
		System.out.println(numberOfPeas+" number of peas");
		System.out.println(numberOfPods+"number of pods");
		System.out.println("creates a total of "+totalNumberOfPeas+" peas");
	}

}
