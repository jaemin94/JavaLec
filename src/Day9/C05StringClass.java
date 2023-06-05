package Day9;

import java.util.Scanner;


// 시험범위

public class C05StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int alength, blength;
//		char achar, bchar;
//		String str1 = new String("java Powerful");
//		String str2 = new String("java Programming");
//		String str3 = str1 + str2;
//			
//		System.out.println(str3);
//		
//		System.out.println("str1 : " + System.identityHashCode(str1));
//		
//		alength = str1.length(); // 문자의 길이만큼 출력
//		blength = str2.length();
//		achar = str1.charAt(5); // 문자에서 지정된 차례의 문자를 출력
//		bchar = str2.charAt(10);
//		System.out.println("Str1에 저장 ="+str1 + " 길이 = "+alength);
//		System.out.println("Str2에 저장 ="+str2 + " 길이 = "+blength);
//		System.out.println("Str1의 5번째 문자 ="+achar);
//		System.out.println("Str1의 10번째 문자 ="+bchar);
//		System.out.println("Str1의 대문자로 변환 : "+str1.toUpperCase()); // 소문자를 -> 대문자로
//		System.out.println("Str1의 소문자로 변환 : "+str1.toLowerCase()); // 대문자를 -> 소문자로
//		System.out.println("Str2의 a를 A로 변환 : "+str2.replace('a','A'));
//		System.out.println("----------------------------");

		
		//trim() : 앞뒤 공백 제거 
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		//subString() : 문자열 자르기
		System.out.println(tmp.substring(2));
		System.out.println(tmp.substring(2,5));
		//indexOf("문자열") : 문자열의 index번호 확인
		System.out.println(tmp.indexOf("H"));
		//lastIndexOf("문자열") : 문자열의 index번호 확인
		System.out.println(tmp.lastIndexOf("H"));
		//contains("문자열") : 문자열 포함여부
		System.out.println(tmp.contains("HE"));
		//split("구분자") : 구분자를 기준으로 문자열을 분할(배열형으로 저장)
		String arr[] = tmp.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d] = %s\n",i,arr[i]);
		}
		
	}

}
