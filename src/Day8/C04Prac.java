package Day8;

class Sub
{
	int sub1(int x, int y)
	{
		return x-y;
	}
	
	int sub2(int x, int y)
	{
		int sub =0;
		int max =x;
		if(max < y) {
			max = y;
			sub = max - x;
		}
		else
		{
			max = x;
			sub = max -y;
		}
		return sub;
	}
	
	int sub3(int x, int y, int z)
	{
		int sub = 0;
		int max = 0;
		if (x> y && x> z)
		{
			max = x;
			sub = max - y - z;
		}
		else if (y>x && y >z)
		{
			max = y;
			sub = max - x- z;
		}
		else if(z >  y && z >y)
		{
			max = z;
			sub = max - x- y;
		}
		
		return sub;
	}
}

class Mul
{
	int mul1(int x, int y)
	{
		return x*y;
	}
	
	int mul2(int x, int y, int z)
	{
		return x*y*z;
	}
	
	void mul3()
	{
		int x = 20;
		int y = 30;
		System.out.println(x + "x" + y + " = " + (x*y));
	}
}


public class C04Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub subCal = new Sub();
		Mul mulCal = new Mul();
		
		int r1 = subCal.sub1(200,100);
		System.out.println(r1);
		int r2 = subCal.sub2(100,200); // 큰수에서 작은수의 뺄셈결과를 반환
		System.out.println(r2);
		int r3 = subCal.sub3(100,500,200); // 큰수에서 작은수의 뺄셈 결과를 반환
		System.out.println(r3);
		
		int r4 = mulCal.mul1(10,20);
		System.out.println(r4);
		int r5 = mulCal.mul2(10,20,30);
		System.out.println(r5);
		mulCal.mul3(); // 내부에서 두개의 값을 받아 곱셈의 결과를 콘솔창에 출력
		
	}

}
