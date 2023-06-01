package Day8;

import java.util.Scanner;

class C03Person {

	String name;
	int age;
	float height;
	double weight;
	
	void talk()
	{
		System.out.println(name + " 님이 말합니다.");
	}

	void walk()
	{
		System.out.println(name + " 님이 걷습니다.");
	}
	
	void showInfo()
	{
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
	
	
}

public class C03PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		C03Person p1 = new C03Person();
		
		p1.name = sc.next();
		p1.age = sc.nextInt();
		p1.height = sc.nextFloat();
		p1.weight = sc.nextDouble();
		
		p1.talk();
		p1.walk();
		p1.showInfo();
		

		
		
	}

}
