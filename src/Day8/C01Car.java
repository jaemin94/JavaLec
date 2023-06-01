package Day8;

public class C01Car {

	 String Owner;
	 int speed;
	 int fuel;
	 
	 void Accel()
	 {
		 System.out.println(Owner + " 님이 현재속도 " + speed + " 에서 "+ (speed+5) + " 로 가속합니다.");
	 }
	 void Break()
	 {
		 System.out.println(Owner + " 님이 현재속도 " + speed + " 에서 "+ (speed-5) + " 로 감속합니다.");
	 }
	 
	void showInfo()
	{
		System.out.println("소유자:" + Owner + "\t스피드:" + speed + "\t연료:" + fuel);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01Car car = new C01Car();
		
		car.Owner = "홍길동";
		car.speed =50;
		car.fuel = 100;	
		car.Accel();
		car.Break();
		car.showInfo();
		
	}

}
