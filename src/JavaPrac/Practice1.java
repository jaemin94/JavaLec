package JavaPrac;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://velog.io/@layssingcar/%EC%A1%B0%EA%B1%B4%EB%AC%B8-%EC%8B%A4%EC%8A%B5%EB%AC%B8%EC%A0%9C
		Scanner scan = new Scanner(System.in);
		
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
  
  
  
  
  
  
  
  
  
 */



