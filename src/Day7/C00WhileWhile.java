package Day7;

import java.util.Scanner;

public class C00WhileWhile {

	public static void main(String[] args) {
		// 중첩 While 문
		
				//*****
				//*****
				//*****
				//*****
//		int i = 0;
//		int j = 0;
//		
//		while(i<=3)
//		{
//			j=0;
//			while(j<=4)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<h)
//		{
//			j=1;
//			while(j<=5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<h)
//		{
//			j=1;
//			while(j<h)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		
				//*
				//**
				//***
				//****
				//*****
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<h)
//		{
//			j=0;
//			while(j<i+1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<h)
//		{
//			j=0;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
				//*****
				//****
				//***
				//**	
		
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<h)
//		{
//			j=0;
//			while(j<=(h-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
				
				//*
				//**
				//***
				//****
				//*****
				//****
				//***
				//**	
				//*	
				
//		int i = 0;
//		int j = 0;
//		
//		
//		while(i<9)
//		{
//			if(i<5)
//			{
//				j=0;
//				while(j<=i)
//				{
//					System.out.print("*");
//					j++;
//				}
//			}
//			else
//			{
//				j=0;
//				while(j<=8-i)
//				{
//					System.out.print("*");
//					j++;
//				}
//			}
//
//			System.out.println();
//			i++;
//		}
		
			//   *
			//  ***
			// *****
			//*******
//			int i =0;
//			int j = 0;
//			int k =0;
//			
//			while(i<=3)
//			{
//				j=0;
//				k=0;
//				while(j<=2-i )
//				{
//					k=0;
//					System.out.print(" ");
//					j++;
//				}
//				while(k<=2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//				System.out.println();
//				i++;
//			}
			
			//******* 	0-6 7
			// *****	0-4 5
			//  ***		0-2 3
			//   *		 0 	0
			
//		int i =	0;
//		int j = 0;
//		int k =	0;
//		
//		while(i<=3)
//		{
//			j=0;
//			k=0;
//			while(j<i)
//			{
//				System.out.print(" ");
//				j++;
//			}
//			while(k<=(6-i)-i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		

			//   *		 0
			//  ***		0-2	
			// *****	0-4
			//*******	0-6
			// *****	0-4
			//  ***		0-2	
			//   *		 0
			
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while(i<=6)
//		{
//			
//			if(i<=3)
//			{
//				j=0;
//				k=0;
//				while(j<=2-i)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				while(k<=2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			else
//			{
//				j=0;
//				k=0;
//				while(j<i-3)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				while(k<=(6-i)*2)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
			
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<=h)
		{
			
			if(i<(h/2+1))
			{
				j=0;
				k=0;
				while(j<=2-i)
				{
					System.out.print(" ");
					j++;
				}
				while(k<=2*i)
				{
					System.out.print("*");
					k++;
				}
			}
			else
			{
				j=0;
				k=0;
				while(j<i-(h/2))
				{
					System.out.print(" ");
					j++;
				}
				while(k<=(h-1)*2-2*i)
				{
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
		
	
		
		
	}

}


/*
 
	
		구구단 역순 출력 :	int dan = 2;
						int i = 9;
		
						while(dan <= 9)
						{
							i = 9;
							while(i>=1)
							{
								System.out.println(dan + " x " + i + " = " + (dan * i));
								i--;
							}
							System.out.println();
							dan++;
						}






*/