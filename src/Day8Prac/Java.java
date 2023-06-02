package Day8Prac;

import java.util.Scanner;

class Rectangle
{
	int x;
	int y;
	int width;
	int height;
	
	Rectangle()
	{
		
	}
	Rectangle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square()
	{
		return width * height;
	}
	
	void show()
	{
		System.out.println("x: " + x + " y: " + y +" 넓이: " + square());
	}
	
	boolean containts(Rectangle r)
	{
		return true;
		
	}
	
}

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("S의 면적은 " + s.square() );
		if(t.containts(r))
			System.out.println("t는 r을 포함합니다.");
		if(t.containts(s))
			System.out.println("t는 s을 포함합니다.");
	}

}

/*
	1. class TV
		{
			String brand;
			int madeYear;
			int size;
	
			TV(String brand, int madeYear, int size )
			{
				this.brand = brand;
				this.madeYear = madeYear;
				this.size = size;
		
			}
	
			void show()
			{
				System.out.println(brand + "에서 만든 " +madeYear + " 년형 "+ size +"인치 TV");
			}
		}

		public class Java {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				TV mytv = new TV("LG",2017,32);
				mytv.show();
			
			}

		}

	2. class Grade
		{
			private int math;
			private int science;
			private int eng;
	
			Grade(int math, int science, int eng)
			{
				this.math = math;
				this.science = science;
				this.eng = eng;
			}
	
			int Total()
			{
				return math + science + eng;
			}
	
			double average()
			{
				return Total()/3;
			}
		}

		public class Java {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		
				System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 : ");
				int math = sc.nextInt();
				int science = sc.nextInt();
				int eng = sc.nextInt();
		
				Grade me = new Grade(math,science,eng);
				System.out.println("평균은: " + me.average());
			}

		}


	3. class song
		{
			String title;
			String artist;
			int year;
			String country;
	
			song()
			{
		
			}
			song(String title, String artist, int year, String country)
			{
				this.title = title;
				this.artist = artist;
				this.year = year;
				this.country = country;
		
			}
	
			void show()
			{
				System.out.println("노래제목: "+ title +" 가수이름: "+ artist + " 발표년도: " + year +" 국적: "+ country);
			}
	
		}

		public class Java {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				song s= new song("Dancing Queen", "ABBA", 1978, "Sweden");
		
				s.show();
		
		
			}

		}

	4. class Rectangle
		{
			int x;
			int y;
			int width;
			int height;
	
			Rectangle()
			{
		
			}
			Rectangle(int x, int y, int width, int height)
			{
				this.x = x;
				this.y = y;
				this.width = width;
				this.height = height;
			}
	
			int square()
			{
				return width * height;
			}
	
			void show()
			{
				System.out.println("x: " + x + " y: " + y +" 넓이: " + square());
			}
	
			boolean containts(Rectangle r)
			{
				return true;
		
			}
	
		}

		public class Java {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				Rectangle r = new Rectangle(2,2,8,7);
				Rectangle s = new Rectangle(5,5,6,6);
				Rectangle t = new Rectangle(1,1,10,10);
		
				r.show();
				System.out.println("S의 면적은 " + s.square() );
				if(t.containts(r))
					System.out.println("t는 r을 포함합니다.");
				if(t.containts(s))
					System.out.println("t는 s을 포함합니다.");
			}

		}






*/