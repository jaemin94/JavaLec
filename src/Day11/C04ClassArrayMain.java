package Day11;

class C04Person
{
	String name;
	int age;
	
	C04Person()
	{
		
	}
	C04Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "[이름: " + name + " 나이: " + age + "]";
	}
}


public class C04ClassArrayMain {

	public static void main(String[] args) {

		// 클래스형 배열을 만들때는 배열 생성은 선언후 초기화 및 값을 입력할때 배열을 다시 선언해줘야한다.
		C04Person[] person = new C04Person[3];
	
		
		for(int i = 0; i < person.length; i ++)
		{
			person[i] = new C04Person("길동" + i , (int)(Math.random()*50)+1);
			System.out.println(person[i].toString());
		}
		
		
		
	}

}
