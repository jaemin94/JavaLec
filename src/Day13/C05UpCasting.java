package Day13;

class A
{
	int n1;
}

class B extends A
{
	int n2;
	
	public String toString()
	{
		return "B [ n1= " + n1 + ", n2= " + n2 + "]";
	}
}

class C extends A
{
	int n3;
	public String toString()
	{
		return "C [ n1= " + n1 + ", n3= " + n3 + "]";
	}
}

class D extends B
{
	int n4;
	public String toString()
	{
		return "D [ n1= " + n1 + ", n2= " + n2 + ", n4=" + n4 + "]";
	}
}

class E extends C
{
	int n5;
	public String toString()
	{
		return "E [ n1= " + n1 + ", n3= " + n3 + ", n5=" + n5 + "]";
	}
}


public class C05UpCasting {
	
	public static void UpDownTestFunc(A obj)
	{
		// B or C or D or E 클래스인지 구별
		if(obj instanceof D)
		{
			D down = (D)obj;
			down.n1 = 10;
			down.n2 = 20;
			down.n4 = 40;
			System.out.println(obj.toString());
		}
		else if(obj instanceof E)
		{
			E down = (E)obj;
			down.n1 = 10;
			down.n3 = 30;
			down.n5 = 50;	
			System.out.println(obj.toString());
		}
		else if(obj instanceof C)
		{
			C down = (C)obj;
			down.n1 = 10;
			down.n3 = 30;	
			System.out.println(obj.toString());
		}
		else if(obj instanceof B)
		{
			B down = (B)obj;
			down.n1 = 10;
			down.n2 = 20;
			System.out.println(obj.toString());
		}
	}

	public static void main(String[] args) {
			
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		E ob4 = new E();

		UpDownTestFunc(ob1);
		UpDownTestFunc(ob2);
		UpDownTestFunc(ob3);
		UpDownTestFunc(ob4);
	}

}
