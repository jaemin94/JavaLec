package Day13;


// 메서드 오버라이딩(함수 재정의)
// 상속관계에서 상위 클래스의 메서드를 하위 클래스가 재정의(고쳐서사용) 하는 것을 허용하는 문법
// 메서드의 헤더부분은 동일할게 두고 바디({})의 로직을 다르게 함으로써 같은 상위클래스로부터
// 물려받은 메서드의 로직을 다양하게 들수있다(다형성)

class Animal
{
	public void sound()
	{
		System.out.println("소리를 냅니다.");
	}
}

class Dog extends Animal
{
	public void sound()
	{
		System.out.println("멍멍 소리를 냅니다.");
	}
}

class Cat extends Animal
{
	public void sound()
	{
		System.out.println("야옹 소리를 냅니다.");
	}
}

public class C03OverRiding {

	public static void main(String[] args) {
		
		Dog dg = new Dog();
		Cat ct = new Cat();
		
		
		dg.sound();
		ct.sound();
		
		

	}

}
