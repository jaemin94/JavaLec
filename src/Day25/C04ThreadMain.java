package Day25;

class IncrementThread implements Runnable {
	  private static int counter = 0;

	  public int getCounter() {
	        return counter;
	    }
	  
	    @Override
	    public void run() {
	        for (int i = 0; i <100000; i++) {
	            int temp = counter;  // 공유 변수 읽기
	            temp++;  // 값 증가
	            counter = temp;  // 공유 변수 업데이트
	            System.out.println(Thread.currentThread().getName()+"s counter : " + counter);
	        }
	    }
}

public class C04ThreadMain {

 
	public static void main(String[] args)  throws InterruptedException{

	     IncrementThread incrementThread1 = new IncrementThread();
	     IncrementThread incrementThread2 = new IncrementThread();

	        Thread thread1 = new Thread(incrementThread1);
	        Thread thread2 = new Thread(incrementThread2);

	        thread1.start();
	        thread2.start();

	        thread1.join();
	        thread2.join();

	        System.out.println("Final value: " + incrementThread1.getCounter());
		 

	}
}
