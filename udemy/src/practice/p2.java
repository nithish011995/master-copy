package practice;

import java.util.Scanner;

public class p2 {
	
	public static void main(String[] args) {
		
	/*	String a="abcd";
		String rev=" ";
		
		for (int i = a.length()-1; i >=0; i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String rev="";
		
		for (int i =s.length()-1; i >=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
		

}
