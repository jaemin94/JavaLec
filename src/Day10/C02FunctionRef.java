package Day10;

class Tv
{	
	BasicController basicController;
	ExtraController extraController;

	Tv()
	{
		basicController = new BasicController();
		extraController = new ExtraController();
	}
	
	void TvInfo()
	{
		basicController.showInfo();
	}

	
}

class BasicController
{
	// Basic Controller 
	//  - ON/OFF
	//	- ChangeChannel
	//  - SetVolumn
	
	ONOFF onoff;
	Channel channel;
	Volumn volumn;
	
	void setOnOff(ONOFF onoff)
	{
		this.onoff = onoff;
	}
	
	void setChannel(Channel channel)
	{
		this.channel = channel;
	}
	
	void setVolumn(Volumn volumn)
	{
		this.volumn = volumn;
	}
	
	void showInfo()
	{
		System.out.println("현재 ONOFF : " + onoff.isPowerOn);
		System.out.println("현재 Channel : " + channel.curChannel);
		System.out.println("현재 Volumn : " + volumn.curVolumn);
	}
	
}
class ONOFF
{
	boolean isPowerOn = false;
	
	void on()
	{
		if(isPowerOn == true)
			{
				System.out.println("켜져있습니다.");
			}
		else
			isPowerOn = true;
			System.out.println("켜졌습니다.");
	}
	
	void off()
	{
		if(isPowerOn == true)
		{
			isPowerOn = false;
			System.out.println("꺼져습니다.");
		}
	
	}
}

class Channel
{
	int curChannel;
	void setChannel(int channel)
	{
		curChannel = channel;
	}
	
}

class Volumn
{
	int curVolumn;
	void setVolumn(int volumn)
	{
		curVolumn = volumn;
	}
}


class ExtraController
{
	// Extra Controller
	// Module - InternetSearching
}

public class C02FunctionRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv1 = new Tv(); // basicController, extraController 가 기본적으로 생성된다.
		tv1.basicController.setOnOff(new ONOFF());
		tv1.basicController.setChannel(new Channel());
		tv1.basicController.setVolumn(new Volumn());
		
		tv1.TvInfo();
		tv1.basicController.onoff.on();
		tv1.TvInfo();
	}

}
