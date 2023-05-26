package JavaPrac;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		if(age <= 13)
		{
			System.out.println("어린이");
		}
		else if(age >13 && age <= 19)
		{
			System.out.println("청소년");
		}
		else
		{
			System.out.println("성인");
		}
		
		//String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");
	}

}


/*
	실습1_1 : Scanner scan = new Scanner(System.in);
			 System.out.print("인월 수 : ");
			 int people = scan.nextInt();
		
			 System.out.print("사탕 개수 : ");
			 int candyNum = scan.nextInt();
		
			 System.out.print("1인당 사탕 개수 : ");
			 int perpeople = scan.nextInt();
		
			 int leftover = candyNum - (people*perpeople);
		
			 System.out.println("남은 사탕 개수 : " + leftover);
	


	실습1_2 : Scanner scan = new Scanner(System.in);
			 System.out.print("이름 : ");
			 String name = scan.nextLine();
		
			 System.out.print("학년 : ");
			 int Grade = scan.nextInt();
		
			 System.out.print("반 : ");
			 int ban = scan.nextInt();
			 
			 System.out.print("번호 : ");
		 	 int perno = scan.nextInt();
		
		 	 System.out.print("성적 : ");
		 	 double result = scan.nextDouble();
		
		
			 System.out.println(Grade + "학년 " + ban + "반 " + perno + "번 " + name + 
			 					"의 성적은 " + result + "이다." );


	실습1_3 : Scanner scan = new Scanner(System.in);
		
			 System.out.print("국어 : ");
			 int kor = scan.nextInt();
		
			 System.out.print("영어 : ");
			 int eng = scan.nextInt();
		
			 System.out.print("수학 : ");
			 int math = scan.nextInt();
		
			 int total = kor + eng + math;
			 System.out.println("합계 : " +total);
		
			 float avg = (float) (total/3.0);
			 System.out.println("평균 : " +avg);

	

	실습1_4 : Scanner scan = new Scanner(System.in);
		
			 System.out.print("입력1 : ");
			 int num1 = scan.nextInt();
		
			 System.out.print("입력2 : ");
			 int num2 = scan.nextInt();
		
			 System.out.print("입력3 : ");
			 int num3 = scan.nextInt();
		
			 boolean result = num1 == num2 && num2 == num3;
		
			 System.out.println(result);

	실습1_5 : Scanner scan = new Scanner(System.in);
		
			 System.out.print("나이 : ");
			 int age = scan.nextInt();
		
			 if(age <= 13)
			 {
				System.out.println("어린이");
			 }
			 else if(age >13 && age <= 19)
			 {
			 	System.out.println("청소년");
			 }
			 else
			 {
				System.out.println("성인");
			 }
		
			// String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");



*/