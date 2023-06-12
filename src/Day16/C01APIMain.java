package Day16;

import java.util.Scanner;

class A
{
	int x;
	int y;

	public String toString() {
		
		return "x=" + x + ", y=" + y;
	}
	
	
}

public class C01APIMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		A obj2 = new A();
		System.out.println(obj2);
		System.out.println(obj2.toString());

	}

}
