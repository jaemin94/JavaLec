package Day13;

class Parents
{
	int x;
	int y;
	
	Parents()
	{
		System.out.println("Parents() 생성자 호출");
	}
		
	Parents(int x)
	{
		this.x=x;
		System.out.println("Parents(int x) 생성자 호출");
	}
	
	Parents(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Parents(int x, int y) 생성자 호출");
	}
}

class Son extends Parents
{
	int z;
	
	Son()
	{
		System.out.println("Son() 생성자 호출");
	}
	
	Son(int x)
	{
		super(x);
		System.out.println("Son(int x) 생성자 호출");
	}
	
	Son(int x, int y)
	{
		super(x,y);
		this.z = 0;
		System.out.println("Son(int x, int y) 생성자 호출");
	}
	
	Son(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
		System.out.println("Son(int x , int y, int z) 생성자 호출");
	}
	
	public String toString()
	{
		return "Son [x= " + x + ", y= " + y + ", z= " + z +"]";
	}
	
}

public class C01inheritanceMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s1 = new Son();
		Son s2 = new Son(10);
		Son s3 = new Son(10,20);
		Son s4 = new Son(10,20,30);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
