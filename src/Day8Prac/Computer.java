package Day8Prac;

class C06Computer{
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	C06Computer(String Serialno, String CPUSpec , String RAMSpec, String DISKSpec)
	{
		
	}
	
	void PowerON()
	{
		System.out.println(SerialNo + " 의 전원을 켭니다.");
	}
	
	void PowerOFF()
	{
		System.out.println(SerialNo + " 의 전원을 끕니다.");
	}
	
	void ShowInfo()
	{
		System.out.println("시리얼넘버:"+SerialNo +"\t컴퓨터스펙:"+ CPUSpec+"\t램스펙:"+ RAMSpec + "\t디스크스펙:0" + DISKSpec);
	}
}

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C06Computer LGGram1010 = new C06Computer("1010","I7","16G","2TB");
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();
		
	}

}
