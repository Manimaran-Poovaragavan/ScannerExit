package com.java.project;

import java.util.Scanner;

public class ScannerExit {
	public static void main(String[] args)  {
		
		String msd;
		String msdr = new String();

		System.out.println("enter the string");
		Scanner scan=new Scanner(System.in)	;
		
		 while(scan.hasNext())  {
			
//			String s1 = scan.next();
			
		 System.out.println("enter the string");
		 msd =scan.nextLine();
		 
			if( msd.equals("exit")) {
				
			break;
			}
			msdr += msd;
		}
		 System.out.println("string exited "+msdr);
	}
			}

	

		
		
	
	
		
			
		
			
			
			
		
		
		
			

