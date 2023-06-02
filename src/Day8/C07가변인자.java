package Day8;

class C07Simple {
	
	// 가변인자 : 매개변수의 개수를 지정하지 않는것
	int sum(int ...arg)
	{
		int s =0;
		for(int n : arg)// 향상된 포문 . 요서의 값을 빼서 순차적으로 배열에 값을 넣어주는 것
		{
			System.out.println("인자 값 : " + n);
			s+=n;
		}
		return s;
	}
	
	int sum(double a,int ...arg) // 가변인자는 꼭 마지막에 넣어야된다
	{
		int s =0;
		for(int n : arg)// 향상된 포문 . 요서의 값을 빼서 순차적으로 배열에 값을 넣어주는 것
		{
			System.out.println("인자 값 : " + n);
			s+=n;
		}
		return s;
	}
	
	
}

public class C07가변인자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C07Simple obj = new C07Simple();
		obj.sum(10);
		System.out.println();
		
		obj.sum(10,20);
		System.out.println();
		
		obj.sum(10,20,30);
		System.out.println();
		
		obj.sum(10,20,30,40);
		System.out.println();
		
		int r=obj.sum(10,20,30,40,50,60,70,80);
		System.out.println();
		System.out.println(r);
	}

}
