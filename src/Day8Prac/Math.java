package Day8Prac;

class C05Simple{
	String type;
	int intSum;
	long intSub;
	long intMul;
	
//	int sum(String type,int ...arg)
//	{
//		int s =0;
//		for(int i : arg)
//		{
//			s+=i;
//		}
//		intSum = s;
//		this.type = type;
//		return s;
//		
//	}
//	
//	int sub(String type,int a, int b, int c, int d, int e)
//	{
//		int s = 0;
//		int max = 0;
//		if(a>b && a>c && a>d)
//		{
//			max = a;
//			s = max - b - c - d;
//		}
//		else if(b>a && b>c && b>d)
//		{
//			max = b;
//			s = max - a - c - d;
//		}
//		else if(c>a && c>b && c>d)
//		{
//			max = c;
//			s = max - a - b - d;
//		}
//		else
//		{
//			max = d;
//			s = max - a - b - c ;
//		}
//			
//			
//		intSub = s;
//		this.type = type;
//		return s;
//	}
	
	void mul(String type, int a, int b, int c, int d, int e, int f, int g)
	{
		
		long s = 0;
		s = (long)(a * b * c * d * e * f * g);
		intMul = s;
		this.type = type;
		
	}
	
	public String toString()
	{
		return type + " : " + intMul;
		
	}
	
	//sum함수를 main에 있는 인자에 맞게 오버로딩합니다.
	//toString함수 오버라이딩 합니다.
}

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C05Simple ob = new C05Simple();
		
//		ob.sum("모든Int합",10,20,30,40,50,60,70);		//받은 모든수의 합을 intSum에저장		
//		System.out.println(ob.toString());
//		ob.sub("모든Int차",100,20,30,40,50);			//차는 입력받은 인자중에 제일 큰수에서
//													//나머지 모든 수들을 빼줍니다.
//													//그 결과를 intSub에저장
//		System.out.println(ob.toString());
		ob.mul("모든Int곱",10,20,30,40,50,60,70);		//모든 수의 곱의 결과를 intMul에 저장
		System.out.println(ob.toString());
		
	}

}
