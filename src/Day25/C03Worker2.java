package Day25;

public class C03Worker2 implements Runnable{

	C01GUI gui;
	
	C03Worker2(C01GUI gui)
	{
		this.gui = gui;
	}
	
	
	public void run() {
		while(true)
		{
			gui.area2.append("보내줘\n");
			try {
				Thread.sleep(300);
			} 
			catch(InterruptedException e2)
			{
				System.out.println("Thread 2 정지");
				break;
				
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
