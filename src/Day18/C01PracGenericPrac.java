package Day18;

class Popcorn<T extends 재료1>
{
	private T material;
	
	Popcorn(T material)
	{
		this.material = material;
	}
	void ShowInfo()
	{
		System.out.println(material.toString() + "맛 팝콘");
	}
}

class 재료1
{
	
}

class 캬라멜 extends 재료1
{
	String material;
	캬라멜(String material)
	{
		this.material = material;
	}
	public String toString()
	{
		return material;
	}
}

class 옥수수 extends 재료1
{
	String material;
	옥수수(String material)
	{
		this.material = material;
	}
	public String toString()
	{
		return material;
	}
}

class 민초1
{
	String material;
	민초1(String material)
	{
		this.material = material;
	}
	public String toString()
	{
		return material;
	}
}

public class C01PracGenericPrac {

	public static void main(String[] args) {
		
		Popcorn<캬라멜> ob1 = new Popcorn<캬라멜>(new 캬라멜("캬라멜"));
		ob1.ShowInfo(); // 캬라멜맛 팝콘이 출력
		
		Popcorn<옥수수> ob2 = new Popcorn<옥수수>(new 옥수수("옥수수"));
		ob2.ShowInfo(); // 옥수수맛 팝콘이 출력
		
		// 민초는 재너릭으로 선택되지 않도록 합니다.
//		Popcorn<민초> ob3 = new Popcorn<민초>(new 민초());

		
	}

}
