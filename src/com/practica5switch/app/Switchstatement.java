package com.practica5switch.app;

import java.util.Scanner;

public class Switchstatement {

	public static void main(String[] args) {
		//variable declaration
		
		//variable declaration
	int nMes=0;
	char answer='s';
	
	//object constructruction
	
		Scanner input = new Scanner(System.in);
		do
		{
			
			
		nMes=0;
		//input data validation
		while(nMes<=0)
		{
		System.out.println("gime me a month day");
		nMes =input.nextInt();
        if (nMes<=0) 
        {
        	System.out.println("Dato No Valido");}
	}
		
     switch (nMes) {
     case 1: System.out.println("january");
     break;
     case 2: System.out.println("february");
     break;
     case 3: System.out.println("marse");
     break;
     case 4: System.out.println("april");
     break;
     case 5: System.out.println("may");
     break;
     case 6: System.out.println("jane");
     break;
     case 7: System.out.println("july");
     break;
     case 8: System.out.println("august");
     break;
     case 9: System.out.println("september");
     break;
     case 10: System.out.println("october");
     break;
     case 11: System.out.println("november");
     break;
     case 12: System.out.println("december");
     break;
     default: System.out.println("Not Valid");
     break;
     }
     System.out.println("do you wish to see another month?(y/n))");
     answer=input.next().charAt(0);
     }while (answer=='y');
		
    
		
	
		}
}
