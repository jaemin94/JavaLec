package Day13;

class Point2D
{
	int x;
	int y;
	
	Point2D()
	{
		System.out.println("Point2D 생성자 호출!");
	}
	
	public String toString()
	{
		return "Point2D [x= " + x + ", y=" + y + "]";
	}
}

class Point3D extends Point2D
{
	int z;
	
	Point3D()
	{
		super();
		System.out.println("Point3D 생성자 호출!");
	}
	
	public String toString()
	{
		return "Point3D [x= " + x + ", y= " + y + ", z= "+z+"]";
	}
}

public class C01inheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3D ob = new Point3D();
		
		ob.x = 100;
		ob.y = 200;
		ob.z = 300;
		System.out.println(ob.toString());
		
	}

}
