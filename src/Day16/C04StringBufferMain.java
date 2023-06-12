package Day16;

public class C04StringBufferMain {

	public static void main(String[] args) {

//		String str1 = "Hello";
//		
//		System.out.println("STR1 : " + System.identityHashCode(str1));
//		
//		String str2 = "World";
//		str1 = str1.concat(str2); // 문자열 덧붙이기 함수
//		System.out.println(str1);
//		System.out.println("STR1 : " + System.identityHashCode(str1));
		
		long startTime = System.currentTimeMillis();
		String str = "";
		for(int i = 0; i < 100000; i++)
		{
			str+="H";
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("소유시간 : " + (endTime - startTime)+ "ms");
	}

}
