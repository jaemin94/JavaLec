package Day14;


class Par1
{
	void Func() // 완성형 메서드
	{
		System.out.println();
	}
}

class Son1 extends Par1
{
	void Func() // 완성형 메서드
	{
		System.out.println("Son1에서 자율적으로 재정의한 Func() 호출!");
	}
}

abstract class Par2
{
	abstract void Func(); // 추상 메서드
}

class Son2 extends Par2
{
	void Func()
	{
		System.out.println("Son2에서 강제적으로 재정의한 Func() 호출!");
	}
}

public class C01AbstractMain {

	public static void main(String[] args) {
		
		Par1 ob1 = new Par1(); // 상위 클래스 객체 생성 가능하다
		Son1 ob2 = new Son1(); // 하위 클래스 객체 생성 가능하다
		Par1 ob3 = ob2;		   // UpCasting
		ob3.Func();			   // 상위 참조변수로 재정의한 하위객체 메서드 접근 가능
		
//		Par2 ob1 = new Par2(); // 추상클래스 객체 생성 불가능
		Son2 ob4 = new Son2(); // 하위 클래스 객체 생성가능(추상 메서드를 재정의 해야 가능하다)
		Par2 ob5 = ob4;		   // UpCasting
		ob5.Func();			   // 
	}

}
