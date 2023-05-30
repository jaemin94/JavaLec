package JavaPrac;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://velog.io/@layssingcar/%EC%A1%B0%EA%B1%B4%EB%AC%B8-%EC%8B%A4%EC%8A%B5%EB%AC%B8%EC%A0%9C
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		char op;
		double result = 0;
		boolean flag = true;
		
		System.out.print("피연산자1 입력 : ");
		num1 = scan.nextInt();
		
		if (num1 < 0)
			System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
		else {
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			op = scan.next().charAt(0);
			
			if (num1 == 0 && op == '/')
				System.out.println("0은 나눌 수 없습니다.");
			else {
				switch(op) {
				case '+': case '-': case '*': case '/': case '%': 
					System.out.print("피연산자2 입력 : ");
					num2 = scan.nextInt();
					
					if (num2 < 0) {
						System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
						flag = false;
					}
					else {
						switch(op) {
						case '+': result = num1 + num2; break;
						case '-': result = num1 - num2; break;
						case '*': result = num1 * num2; break;
						case '/':
						if (num2 == 0) flag = false;
						else result = (double)num1 / num2; break;
						case '%':
						if (num2 == 0) flag = false;
						else result = num1 % num2; break;
						}
						
						if (flag)
							System.out.printf("%d %c %d = %f\n", num1, op, num2, result);
						else
							System.out.println("0으로 나눌 수 없습니다.");
						break;
					}
				default: System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
		
	}

}

/*
  
 	실습1_1 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("1.입력");
			 System.out.println("2.수정");
			 System.out.println("3.조회");
			 System.out.println("4.삭제");
			 System.out.println("5.종료");
		
		
			 System.out.print("메뉴 번호를 선택하세요 :");
			 int choice = scan.nextInt();
		
			 String result = "";
		 	switch(choice)
			 {
			 case 1 : result = "입력"; break;
			 case 2 : result = "수정"; break;
		 	 case 3 : result = "조회"; break;
			 case 4 : result = "삭제"; break;
			 case 5 : System.out.println("프로그램이 종료되었습니다.");break;
	
			 default : System.out.println("잘못 입력하셨습니다.");	
			 }
		
			 switch(choice)
			 {
			 case 1, 2, 3, 4 : System.out.println(result + "메뉴입니다.");
			 }
  
 	실행1_2 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("숫자를 한 개 입력하세요 : ");
			 int num = scan.nextInt();
		
			 if(num > 0 && num%2==0)
			 {
				 System.out.println("짝수입니다.");
			 }
			 else if(num > 0 && num%2 !=0)
			 {
				 System.out.println("홀수입니다.");
			 }
			 else if(num < 0)
			 {
				 System.out.println("양수만 입력하세요");
			 }
  
  
  	실습1_3 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("국어점수 : ");
			 int kor = scan.nextInt();
			 System.out.println("수학점수 : ");
			 int math = scan.nextInt();
			 System.out.println("영어점수 : ");
			 int eng = scan.nextInt();
		
			 int sum = kor + math + eng;
			 double avg = sum / 3;
			 
			 if(kor >=40 && math >=40 && eng >=40 && avg >=60)
			 {
				System.out.println("국어 : "+kor+ "\n수학 : "+math+"\n영어 : "+eng+"\n합계 : "+sum +"\n평균 : "+avg+"\n축하합니다. 합격입니다.");
			 }
			 else
			 {
				 System.out.println("불합격입니다.");
			 }
  
  
  	실습1_4 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("1~12 사이의 정수를 입력하세요 : ");
			 int month = scan.nextInt();
		
			 switch(month)
			 {
			 case 1,3,5,7,8,10,12: System.out.println(month + "월은 31일까지 있습니다");
			 break;
			 case 2,4,6,9,11 : System.out.println(month + "월은 30일까지 있습니다");
			 break;	
			 default: System.out.println(month + "월은 잘못 입력된 달입니다.");
			 }
  
  	실습1_5 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("키(m)를 입력해 주세요 : ");
			 double height = scan.nextDouble();
		
			 System.out.println("몸무게(kg)를 입력해 주세요 : ");
			 double weight = scan.nextDouble();
		
			 double BMI = weight / (height * height);
			 System.out.println("BMI 지수 : " + BMI);
		
			 if(BMI < 18.5)
			 {
				System.out.println("저체중");
			 }
			 else if(BMI >= 18.5 && BMI <23)
			 {
				 System.out.println("정상체중");
			 }
			 else if(BMI>=23 && BMI <25)
			 {
				 System.out.println("과체중");
			 }
			 else if(BMI>=25 && BMI <30)
			 {
				System.out.println("비만");
			 }
			 else
			 {
				System.out.println("고도 비만");
			 }
  
  	실습1_6 : Scanner scan = new Scanner(System.in);
		
			 System.out.println("중간 고사 점수 : ");
			 int midExam = scan.nextInt();
		
			 System.out.println("기말 고사 점수 : ");
			 int finalExam = scan.nextInt();
		
			 System.out.println("과제 점수 : ");
			 int project = scan.nextInt();
	
			 System.out.println("출석 회수 : ");
			 int attendance = scan.nextInt();
		
			 System.out.println("========== 결과 ==========");
			 float MidExam = (float) (midExam * 0.2);
			 System.out.println("중간 고사 점수(20) : " + MidExam);
			 float FinalExam = (float) (finalExam * 0.3);
			 System.out.println("기말 고사 점수(30) : " + FinalExam);
			 float Project = (float) (project * 0.3);
			 System.out.println("과제 점수(30) : " + Project);
			 float Attendance = (float) (attendance *5* 0.2);
			 System.out.println("출석 점수(20) : " + Attendance);
			 float finalScore = MidExam + FinalExam + Project + Attendance;
			 System.out.println("총점 : " + finalScore);
		
			 if(finalScore <= 70 || attendance <= 13)
			 {
				System.out.println("Fail [점수 미달]");
			 }
			 else
			 {
				 System.out.println("Pass");
			 }
  
  	실습1_7 : Scanner scan = new Scanner(System.in);
		
			 int num1;
			 int num2;
			 char op;
			 double result = 0;
			 boolean flag = true;
		
			 System.out.print("피연산자1 입력 : ");
			 num1 = scan.nextInt();
		
			 if (num1 < 0)
				System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
			 else {
				System.out.print("연산자 입력(+,-,*,/,%) : ");
				op = scan.next().charAt(0);
			
				if (num1 == 0 && op == '/')
					System.out.println("0은 나눌 수 없습니다.");
				else {
					switch(op) {
					case '+': case '-': case '*': case '/': case '%': 
						System.out.print("피연산자2 입력 : ");
						num2 = scan.nextInt();
					
						if (num2 < 0) {
							System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
							flag = false;
						}
						else {
							switch(op) {
							case '+': result = num1 + num2; break;
							case '-': result = num1 - num2; break;
							case '*': result = num1 * num2; break;
							case '/':
							if (num2 == 0) flag = false;
							else result = (double)num1 / num2; break;
							case '%':
							if (num2 == 0) flag = false;
							else result = num1 % num2; break;
							}
						
							if (flag)
								System.out.printf("%d %c %d = %f\n", num1, op, num2, result);
							else
								System.out.println("0으로 나눌 수 없습니다.");
							break;
						}
					default: System.out.println("잘못 입력하셨습니다.");
					}
  
  
  
 */



