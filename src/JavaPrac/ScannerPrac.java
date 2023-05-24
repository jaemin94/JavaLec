package JavaPrac;

import java.util.*;


public class ScannerPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String Name = scanner.nextLine();
		
		System.out.print("주민번호 6자리 : ");
		String PersonalId= scanner.nextLine();
		
		System.out.print("전화번호 : ");
		String PhoneNum= scanner.nextLine();
		
		
		System.out.println("이름 : "+ Name +'\n'+ "주민번호 6자리 : " + PersonalId +'\n' + "전화번호 : " + PhoneNum);
	}

}


/*
 
 	public static void Scanner_1(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수 : ");
		String strNum2= scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 : "+ result);
	}
  
  
  	public static void 실습Scanner_2(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String Name = scanner.nextLine();
		
		System.out.print("주민번호 6자리 : ");
		String PersonalId= scanner.nextLine();
		
		System.out.print("전화번호 : ");
		String PhoneNum= scanner.nextLine();
		
		
		System.out.println("이름 : "+ Name +'\n'+ "주민번호 6자리 : " + PersonalId +'\n' + "전화번호 : " + PhoneNum);
	}
  
 
 */
