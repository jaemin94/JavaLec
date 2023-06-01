package Day8;

class C02Person {

	String name;
	int age;
	float height;
	double weight;

}

public class C02PersonMain {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C02Person p1 = new C02Person();
		
		p1.name = "홍길동";
		p1.age = 55;
		p1.height = 177.5f;
		p1.weight = 70.4;
		
		System.out.print("이름 : " + p1.name +" 나이 : " + p1.age +" 키 : " + p1.height +" 몸무게 : " + p1.weight);
	}

}
