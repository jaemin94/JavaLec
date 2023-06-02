package Day8;

import java.util.Scanner;

class Sum {
	// 속성
	Scanner scan = new Scanner(System.in);
	
	// 기능
	int sum1(int x, int y)
	{
		System.out.println("sum1(x,y) 호출!");
		return x + y;
	}
	
	int sum2()
	{
		System.out.println("int sum2(x,y) 호출!");
		int x = scan.nextInt();
		int y = scan.nextInt();
		return x+y;
	}
	
	// 인자를 받으나 반환 x
	void sum3(int x, int y)
	{
		System.out.println("void sum3(int x,int y) 호출!");
		System.out.println(x+ "+" + y + "=" + (x+y));
	}
	
	// 인자 x 반환 x
	void sum4()
	{
		System.out.println("void sum4() 호출!");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x+ "+" + y + "=" + (x+y));
	}
	
}


public class C04SimpleMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum calc = new Sum();
		int result1 = calc.sum1(10,20);
		
		System.out.println("result : " + result1);
//		int result2 = calc.sum2();
//		System.out.println("result2: " + result2);
		calc.sum3(30,30);
		calc.sum4();
	}

}
