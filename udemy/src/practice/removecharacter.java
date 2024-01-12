package practice;

import java.util.Scanner;

public class removecharacter {

	public static void main(String[] args) {
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println("enter the character to remove");
		char c=sc.next().charAt(0) ;
		 String res = "";
		
		for (int i = 0; i < s.length(); i++) {
			
		char temp =s.charAt(i);
		
		if(c!=temp)
		{
			res+=temp;
		}
		}
		System.out.println(res);*/
		
		
		String s="abababa";
		char c='a';
		String res="";
		
		for (int i = 0; i < s.length(); i++) {
			char temp=s.charAt(i);
			if(c!=temp)
			{
				res=res+temp;
			}
		}
		System.out.println(res);
	}
}
