package Day12;

// 자바의 메모리구조

// 스택영역			: {}내에서 선언되는 변수, {} 벗어나면 소멸
// 클래스(메서드) 영역	: 공유메모리 영역, static변수, static함수, 멤버변수, 생성자 함수
// 힙영역				: new 예약어 사용시 메모리 공간 할당, 참조변수 연결해제시 GC(garbage_class)에 의해 제거

class C01Simple
{
	static int num1 = 0; // C01Simple 객체간의 공유되는 변수
						 // 객체 생성과는 무관하게 메모리공간에 할당
	int num2 = 0;
	
	// toString 재정의
	public String toString()
	{ 
		return "C01Simple [num1= " +num1 + ", num2= " + num2 + "]";
	}
}

public class C01Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01Simple.num1 = 1234;
		System.out.println("Static num1: " + C01Simple.num1);
		
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		ob1.num1 = 100;
		ob1.num2 = 200;
		
		ob2.num1 = 300;
		ob2.num2 = 400;
		
		System.out.println(ob1);
		System.out.println(ob2);
	}

}
