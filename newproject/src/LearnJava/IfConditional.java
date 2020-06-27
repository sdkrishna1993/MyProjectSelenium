package LearnJava;

import java.util.Scanner;

public class IfConditional {

	public static void main(String[] args) {
	
/*	
		Given an integer, , perform the following conditional actions:

			If  is odd, print Weird
			If  is even and in the inclusive range of  to , print Not Weird
			If  is even and in the inclusive range of  to , print Weird
			If  is even and greater than , print Not Weird
	*/	
	//	Scanner sc = new Scanner(System.in);
		
	//int a=	sc.nextInt();
	
	int a =24;
	if(a/2!=0) {
		
		System.out.println("Weird");
	}
	else if((a/2==0) && (a>2 &&a<5)){
		
		System.out.println("first Not weird");
		
	}
	else if((a/2==0)&&(a>6 &&a<20))	{
		
		System.out.println(" second Weird");
	}
	else if((a/2==0)&&(a>20)) {
		
		System.out.println("second Not weird");
	}
		

	}

}
