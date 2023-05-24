package Day2;

public class C03변수상수자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수 : 선 저장 후 처리
		// 변수 : 개발자의 유지보수 측면에서 바뀔 예정이 큰수
		// 변수명 : 저장된 변수공간에 접근하기 위한 문자형태의 주소
		// 자료형 : 수를 저장하기 위해 공간을 형성하는 예약어 + 제약조건
		
		// 상수 : 항상 같은 수
		
		// 대입연산자(=)
		
		// lv(공간) = rv(값 -> 먼저처리)
		
		int num1; // 변수 선언
		num1 = 10; // 변수 초기화
		int num2 = 4; // 변수 선언 및 초기화
		int num3 = num1 + num2; // 변수 선언 하면서 기존 초기화한 변수의 값을 덧셈
		System.out.println(num3); // num1 이랑 num2 을 더한 값

	}

}
