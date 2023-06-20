package Day25;

public class C02Worker implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<5; i++)
		{
			System.out.println("Task1..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.5 초 일시정지
		}
		
	}

}
