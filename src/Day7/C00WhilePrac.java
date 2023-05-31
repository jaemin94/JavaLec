package Day7;

import java.util.Scanner;

public class C00WhilePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요 : ");
		int dan = scan.nextInt();
		int i = 9;
		int sum = 0;
		
		while(i>=1)
		{
			
			System.out.println(dan + " * " + i + " = " + (i*dan));
			i--;
		}
		System.out.println(dan+" 단입니다. ");

	
	}

}

/*
	 문제 1_1
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = scan.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		int m = scan.nextInt();
			
		int sum = 0;
		while(n<=m)	
		{
			System.out.println(" n : " + n);
			sum +=n;
			n++;										
		}
		System.out.println("sum : " + sum);
		
		
		  	Scanner sc = new Scanner(System.in);
		  	int n = sc.nextInt();
		  	int m = sc.nextInt();
		  	
		  	if(n>m)
		  	{
		  		int tmp;
		  		n = m ;
		  		m = tmp;
		  	}		  		 		 
		 
								
		 문제 1_2
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		
		while(i<=n)
		{
			if(i%2 == 0)
				sum1+=i;
			else
				sum2+=i;
				i++;		
				System.out.println("sum2 : " + sum2);
		}
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);

		
		
		// 문제 1_3
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int sum1 = 0;
		
		while(i<=n)
		{
			if(i%3 == 0)
				System.out.println(i +" 는 3의 배수입니다.");
				sum1+=i;
				i++;
		}
		System.out.println("sum1 : " + sum1);
		
		// 문제 1_4
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = scan.nextInt();
		
		int i = 0;
		int sum1 = 0;
		
		while(i<=n)
		{
			if(i%4 == 0)
				System.out.println(i + " 는 4의 배수입니다.");
			else
				sum1+=i;
				i++;
				System.out.println("sum1 : " + sum1);
		}
		System.out.println("sum1 : " + sum1);

		// 1_5 구구단 2 단출력
		final int dan = 2;
		int i = 1;
		int sum = 0;
		
		while(i<=9)
		{
			System.out.println(i + " * " + dan + " = " + (i*dan));
			i++;
		}  
		  
		  
		 
		// 1_6 구구단 N 단출력(N<=9)
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=9)
		{
			
			System.out.println(i + " * " + dan + " = " + (i*dan));
			i++;
		}
		System.out.println(dan+" 단입니다. ");
		
		
		
		// 1_7 구구단 N 단 역순출력(N<=9)
		 Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		int i = 9;
		int sum = 0;
		
		while(i>=1)
		{
			
			System.out.println(i + " * " + dan + " = " + (i*dan));
			i--;
		}
		System.out.println(dan+" 단입니다. ");



*/