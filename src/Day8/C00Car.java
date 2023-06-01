package Day8;

public class C00Car {

	String Owner;
	 int speed;
	 int fuel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C00Car car = new C00Car();
		
		car.Owner = "홍길동";
		car.speed = 0;
		car.fuel = 100;
		
		System.out.println("소유자:" + car.Owner +"\t속도:" + car.speed + "\t연료:" + car.fuel);
		
	}

}
