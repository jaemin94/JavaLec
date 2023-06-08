package Day14;

class Point1 {
	   private int x, y;
	   
	   public Point1()
	   {
		   
	   }
	   
	   public Point1(int x, int y) 
	   { 
		   this.x = x; this.y = y; 
	   }
	   
	   public int getX() 
	   { 
		   return x; 
	   }
	   
	   public int getY() 
	   { 
		   return y; 
	   }
	   
	   protected void move(int x, int y) 
	   { 
		   this.x =x; this.y = y; 
	   }
	}

class ColorPoint1 extends Point1
{
	String color;
	
	public ColorPoint1()
	{
		 super(0, 0);
	      this.color = "BLACK";
	}
	
	public ColorPoint1(int x, int y)
	{
		super(x, y);
		this.color = "BLACK";
	}
	
	public ColorPoint1(int x, int y, String color) 
	{
		super(x, y);
		this.color = color;
		
	}
	
	void setXY(int x, int y)
	{
		move(x,y);
	}
	
	void setColor(String color)
	{
		this.color = color;
	}
	
	
	
	public String toString()
	{
		return color + "색의 (" + getX() + "," + getY() + ")의 점"; 
	}
	
}

public class C04PracJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ColorPoint1 zeroPoint = new ColorPoint1(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
		   ColorPoint1 cp = new ColorPoint1(10, 10); // (10,10) 위치의 BLACK 색 점
		   cp.setXY(5,5);
		   cp.setColor("RED");
		   System.out.println(cp.toString()+"입니다.");
		
	}

}
