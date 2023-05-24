package Day2;

public class C04자료형 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//------------------------------------
//		// 정수 int - 4byte 정수 부호 0
//		//------------------------------------
//		
//		
//		int n1 = 0b10101101;
//		int n2 = 173;
//		int n3 = 0255;
//		int n4 = 0xAD;
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
//		
//		
//		
//		//------------------------------------
//		// 정수 byte - 1byte 정수 부호 0
//		//------------------------------------
//		System.out.println("--------------------------------------------");
//		byte n5 = (byte)-129;
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = (byte)129; 
//		System.out.printf("%d\n", n5);
//		System.out.println(0b10101101); 
//		// 왜 컴파일 에러가 뜨는지 : 0~255를 저장 하지만 음양수를 포함하여 -128~ 127 까지의 수만 저장
//
//		// 왜 음수가 아닌지 -> 4바이트의 변수에 담았기에 상수가 그대로 나온다.
//		//------------------------------------
//		// 정수 short - 2byte 정수 부호 0 | char - 2byte 정수 부호 x(양수만)
//		//------------------------------------
//		
//		char m1 = 65535;
//		short m2 = 32767;
//		
//		char m3 = 60000;
//		short m4 = (short)m3;
//		
//		System.out.printf("%d\n", m4);
//		
//		//------------------------------------
//		// 정수 long - 8byte 정수 부호 0 
//		//------------------------------------
//		
//		long l1 = 10;
//		long l2 = 20L;
//		
//		long l3 = 10000000000L; // 기본적인 int 형에 들어가야 되지만 인트형보다 사이즈가 커서 오류
//		long l4 = 10000000000L;
//		//------------------------------------
//		// 실수 float - 4byte 실수(6~9자리) || double - 8byte 실수(15~18자리),기본자료
//		//------------------------------------
//		
//		
//		float f1 = 0.123456789123456789F;
//		double d2 = 0.123456789123456789;
//		
//		System.out.println(f1);
//		System.out.println(d2);
		
		//------------------------------------
		// 단일문자 char 2byte 정수
		//------------------------------------
		
		
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); //011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); // 011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); // 011000011
//		
//		char ch4 = 'c'+2;
//		System.out.println(ch4);
//		System.out.println((char)ch4);
//		
//		char ch5 =  0xac00;
//		char ch6 =  0Xac00+1;
//		System.out.printf("%c %c\n",ch5,ch6);
//		
//		System.out.printf("%c\n",'\uAC80');
//		System.out.printf("Test : %c\n",'\ud7fb');
//		
//		char n = 10;
//		System.out.printf("Hello %c World",n);
//		
	
		//------------------------------------
		// 문자열 : String (클래스 자료형)
		//------------------------------------
		
		// 기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
//		
		// 클래스자료형
		// 클래스자료형으로 만든 변수는 '참조변수'라고 하고
		// 참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		
//		int n1 = 10;
//		String name = "홀길동";
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//------------------------------------
		// boolean : 논리형 (True/False 저장)
		//------------------------------------
		
		boolean flag = (10>11); // 참(긍정)
		if(flag)
		{
			System.out.println("참인경우 실행");
		}
		else
		{
			System.out.println("거짓일 경우 실행");
		}
		
	}

}
