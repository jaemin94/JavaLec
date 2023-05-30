package Day6;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//단순 IF
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = scan.nextInt();
//		if(age >=8)
//			System.out.println("학교에 다닙니다");
//		
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age <8)
//			System.out.println("학교에 다니지 않습니다");
//
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		
//		int age = 10;
//		if(age >=8)
//			System.out.println("학교에 다닙니다");
//		else
//			System.out.println("학교에 다니지 않습니다");
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		
		
		
		//IF - ELSE
	
		

		//입력값 받기 + if
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 1 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num%2==0)	//짝수이냐?
//		{
//			System.out.println("입력한 값은 짝수 입니다");
//		}
//		else
//		{
//			System.out.println("입력한 값은 홀수 입니다");
//		}
		
		
		
		//문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");;
//		int num = scan.nextInt();
//		
//		if(num%3==0 && num%5==0) 
//			System.out.println(num + "은 3의 배수입니다.");
//		else
//			System.out.println(num + "은 3의 배수가 아닙니다.");
		
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");;
		int n1 = scan.nextInt();
		
		System.out.print("숫자를 입력하세요 : ");;
		int n2 = scan.nextInt();
		
		if(n1 > n2)
			System.out.println("두수 중 큰 숫자는 " + n1);
		else
			System.out.println("두수 중 큰 숫자는 " + n2);
		
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num2 = scan.nextInt();
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num3 = scan.nextInt();
//		
//		int total = num1 + num2 + num3;
//		System.out.println("총합 : " + total);
//		
//		double avg = total/3;
//		System.out.println("평균 : " + avg);
		
	}

}
