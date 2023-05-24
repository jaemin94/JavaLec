package JavaPrac;

public class OperatorsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
			
	}

}


/*
		
		public static void operator_1(String[] args) {
		// TODO Auto-generated method stub

		byte b = 5;
		b = -b; // 크기 자치. int 형이 바이트형이 보다 커서
		int result = 10 /b;
		System.out.println(result);
		
		
		
	}
		

	public static void operator_2(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		int z = (++x) + (y --);
		System.out.println(z);
		
		
		
	}
	
	
	public static void operator_3(String[] args) {
		// TODO Auto-generated method stub

		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1/var2;
		int var4 = (int)(var3*var2);
		System.out.println(var4);
			
	}

	
	public static void operator_4(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 5;
		System.out.println((x>7) && ( y<=5)); //true
		System.out.println((x%3==2) || ( y%2 !=1)); //false
			
	}
	
	
	public static void operator_5(String[] args) {
		// TODO Auto-generated method stub

		int value = 0;
		value = value + 10; // value += 10;
		value = value - 10; // value -= 10;
		value = value * 10; // value *= 10;
		value = value / 10; // value /= 10;
			
	}
	
	public static void operator_6(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result);
			
	}
	
	
*/