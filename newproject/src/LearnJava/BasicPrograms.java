package LearnJava;

import java.util.Arrays;
import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) {
		
		//write your code here
	
		
		int number =10;
		byte num1=12;
		short number2=150;
		long number4= 123456444L;
		float num = 4.3f;
		char alph ='k';
		boolean bool=true;
		
		System.out.println(number2);
		
		//Array
		
		int []a = new int[5];
		
		int b[] = new int[6];
		
		int[] c= new int[] {1,2,3};
		// retrive the entire array
		System.out.println(Arrays.toString(c));
		System.out.println(c[2]);
		
		
		int[]t= {3,5,3,4,3,3};
		
		System.out.println(t[3]);
		
		// retrive the single element
		char name[]= {'c','d','e'};
		
		System.out.println(name[2]);
	// length	
		int u=	name.length;
		System.out.println(u);
	int numbersOf2Dim[][]= {{1,2},{3,4},{4,5}};
	
	for (int i = 0; i < numbersOf2Dim.length; ++i) {
        for(int j = 0; j < numbersOf2Dim[i].length; ++j) {
           System.out.println(numbersOf2Dim[i][j]);
        }
     }
	
	System.out.println("Two dimension "+Arrays.toString(numbersOf2Dim));
	
	// clone
		
		char name2[] = name.clone();
		
		
		//String
		
		String channelName = " tamil rocks ";
		
		int len= channelName.length();
		
		System.out.println(channelName.toLowerCase());
		
		System.out.println(channelName.trim());
		System.out.println(channelName.startsWith(" "));
		System.out.println(channelName.endsWith("rocks "));
		
	// Constant
		
		int e1= 5;
		e1=10;
		System.out.println(e1);
		
	final int ageOfVoting =18;
	
//Operators
	
	byte l1=10;
	byte l2=23;
	
	System.out.println(l1+l2);
	
	//Relational Operators //true or false
	
	System.out.println(l1<l2);
	System.out.println(l1>l2);
	System.out.println(l1<=l2);
	System.out.println(l1>=l2);
	
	//Assignment Operators
	
	System.out.println(l1==l2);
	System.out.println(l1!=l2);
	
	int numm = l1+l2;
	
	numm +=12;
	System.out.println(numm);
	
	//Order of precedent
	
	int number04= 5+5-10*5/9/8%20;
	
	System.out.println(number04);
	// Logical Operators and, or, 
	
	int ageOfPerson =17;
	boolean indianCitizen =true;
	
	// or || 
	
	if(ageOfPerson==17 && indianCitizen ) {
		
		System.out.println(" The above argument is true");
		
	}
	else {
		System.out.println(" The above argument false");
	}
	
	//ternary operator
					//condition			true		false
	String name1= ageOfPerson >=18 ? "egligible" : "not egligible";
	
	System.out.println(name1);
	
	//post increment and Preincrement
	
	int numbe3= 10;
	
	//++numbe3;
	System.out.println(numbe3++);
	System.out.println(numbe3);
	
	//Math function
	
	int newnumber =100;
	int newnumber1=293;
	
	//Math.min(newnumber1, newnumber, numbe3);--- error 
	
	int result=Math.min(newnumber1, newnumber);
	System.out.println(result);
	
	//user input
	
	int number11;
	
	int number22;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the correct number1");
	number11=input.nextInt();
	System.out.print("Enter the correct number2");
	number22=input.nextInt();
	// string input.next();
	
	//multiple input nextline();
	System.out.println( number11 + number22);
	
	
	
	
	
	
	
		}

}
