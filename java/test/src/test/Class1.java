package test;

import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		String text = "Et patati et patata";
		System.out.println(text);
		System.out.print("Hello World");
		System.out.println("!!!");
		System.out.println("toto");		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input some text:");
		String str = scan.nextLine();
		
		System.out.println("Input value: " + str);
		scan.close();
	}
}