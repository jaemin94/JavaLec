package Day7;

import java.util.Scanner;

public class C00While {

	public static void main(String[] args) {
		
//		// 01 반복문 기본
//		int i = 1; 		// 1 탈출용 변수
//		while(i<=10)	// 2 탈출 조건식 // 조건식이 참인 동안에 반복
//		{
//			System.out.println("Hello World");
//			i++;// 3 탈출을 위한 연산
//		}
//		
//		System.out.println(i);
		
		
		// 02 1~10까지의 합
		
//				int i = 1; 		
//				int sum = 0;
//				while(i<=10)	
//				{
//					System.out.println(" i : " + i);
//					sum +=i;
//					i++;										
//				}
//				System.out.println("sum : " + sum);
		
		// 03 1 ~ n 까지의 합
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 : ");
//		int n = scan.nextInt();
//	
//		int i = 1; 		
//		int sum = 0;
//		while(i<=n)	
//		{
//			System.out.println(" i : " + i);
//			sum +=i;
//			i++;										
//		}
//		System.out.println("sum : " + sum);
		
		// 문제
		// n ~ n 까지의 합을 구합니다
		// 1 ~ n 까지의 수중에 짝수 / 홀수의 합을 각각 출력
		// 1 ~ n 까지 수중에 3의 배수만 출력하고 그합도 출력
		// 1 ~ n 까지의 수중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요
		
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
*/		
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
		
	}

}
