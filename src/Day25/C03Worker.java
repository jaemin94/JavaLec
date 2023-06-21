package Day25;

public class C03Worker implements Runnable{

	C01GUI gui;
	
	C03Worker(C01GUI gui)
	{
		this.gui = gui;
	}
	
	
	public void run() {
		while(true)
		{
			gui.area1.append("집에\n");
			try {
				Thread.sleep(300);
			} 
			catch(InterruptedException e2)
			{
				System.out.println("Thread 1 정지");
				break;
			}
			catch (Exception e1) {
				System.out.println(e1);;
			}
		}
		
	}
}
