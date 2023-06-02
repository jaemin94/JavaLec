package Day8;

public class C00Computer {

	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C00Computer LGGram1010 = new C00Computer();
		LGGram1010.SerialNo="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
		LGGram1010.PowerON();
		LGGram1010.ShowInfo();
		LGGram1010.PowerOFF();

	}

}
