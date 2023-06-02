package Day8;

// 생성자 함수(메서드)
// 객체 생성시에 한번 호출되는 특수한 메서드
// 객체 생성시에 1회 호출
// 객체 생성시 필요한 초기값을 부여
// 생성자 함수는 클래스 이름과 동일하며 반환자료형을 가지지 않는다. 
// 생성자 함수를 명시하지 않을때 기본적으로 컴파일러에 의해 주입되는 생성자가 있는데 이를 디폴트 생성자라고 한다.
// 컴파일러에 의해 주입받는 디폴트 생성자는 모든 멤버의 초기값을 '0 or false or null' 로 지정

class C08Simple {

	int m1;
	double m2;
	boolean m3;
	String m4;
	
	C08Simple()// 디폴트 생성자
	{
		System.out.println("디폴트 생성자 호출!");
		this.m1 = 10;
		this.m2 = 20.2;
		this.m3 = true;
		this.m4 = "하입보이";
	}
	
	// 생성자 오버로딩
	C08Simple(int x)
	{
		System.out.println("C08Simple(int x) 생성자 호출!");
		this.m1 = x;
	}
	
	// 생성자 오버로딩 하면서 가변인자 사용
	C08Simple(int ... x)
	{
		System.out.println("C08Simple(int x) 생성자 호출!");
		for(int arg : x)
		{
			this.m1+=arg;
		}
		
	}

	// 마우스 우클릭 Source -> generate toString 클릭
	// 현재 멤버들의 값을 문자열로 출력해준다.
	@Override
	public String toString() {
		return "C08Simple [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	
	
	
}

public class C08ConstructorMain { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C08Simple obj = new C08Simple(); 
		System.out.println(obj.toString());
		
		C08Simple obj1 = new C08Simple(20); 
		System.out.println(obj1.toString());
		
		C08Simple obj2 = new C08Simple(20,100,32,0,21,5,13,54,100); 
		System.out.println(obj2.toString());
	}

}
