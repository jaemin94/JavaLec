package Day3;

public class C04TypeChange {

	public static void main(String[] args) {
//		// 정수연산자(int 보다 작은 변수자료형(short,char,byte))
//		// int 로 자동 형변환
//		byte x = 10;
//		byte y = 20;
//		byte result1 = (byte)(x+y);   //컴파일 에러 x,y 는  각각 int형 자료로 담아서 처리가 되고
//									  // 왼쪽 byte형으로 저장시 작은공간에 큰자료형타입넣으려
//		int result1 = x+y;
//		System.out.println(result1);

// ------------------------------------------------------------------------------------------
		
//		// 정수 연산식(int 보다 큰 변수자료형(long))
//		// 큰타입으로 자동 형 변환
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000;
//		int result = var1+var2+(int)var3; //오른쪽 변수들은 long으로 자동형변환
//													// but 왼쪽 공간이 작은공간이기 때문에
//		long result = var1 + var2 + var3;
//		System.out.println(result);
		
// ------------------------------------------------------------------------------------------		
		
		//실수연산식
		//큰 타입으로 자동 형변환
		int intvar=10;
		float flvar = 3.3f;
		double dbvar = 5.5;
		double result = intvar + flvar + dbvar; // intval, flval가 각각 double 형으로 자동형변환
		
		System.out.println(result);
// ------------------------------------------------------------------------------------------				
	
		
	
	}

}
