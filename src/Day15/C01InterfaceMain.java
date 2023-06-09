package Day15;


interface Remote
{
	void on();
	void off();
	void ChangeChannel(int channel);
}


class Tv implements Remote
{
	int channel;
	
	public void on()
	{
		System.out.println("Tv On");
	}
	public void off()
	{
		System.out.println("Tv Off");
	}
	public void ChangeChannel(int channel)
	{
		this.channel = channel;
		System.out.println("change tv channel " + channel);
	}
}

class Radio implements Remote
{
	int channel;
	
	public void on()
	{
		System.out.println("Radio On");
	}
	public void off()
	{
		System.out.println("Radio Off");
	}
	
	public void ChangeChannel(int channel)
	{
		this.channel = channel;
		System.out.println("change radio channel " + channel);
	}
}

interface Browser
{
	void Searchable(String url);
}



class SmartTv extends Tv implements Browser
{
	public void Searchable(String url)
	{
		System.out.println("브라우저에서 URL " + url + " 접속요청 합니다" );
	}
}

public class C01InterfaceMain {
	
	public static void TurnOn(Remote controller)
	{
		controller.on();
	}
	
	public static void TurnOff(Remote controller)
	{
		controller.off();
	}
	
	public static void Channel(Remote controller, int channel)
	{
		controller.ChangeChannel(channel);;
	}
	
	public static void Search(Browser search, String url)
	{
		search.Searchable(url);
	}
	

	public static void main(String[] args) {
		
//		Tv t1 = new Tv();
//		
//		TurnOn(t1);
//		
//		TurnOff(t1);
//		
//		Channel(t1,20);
//		
//		
//		Radio r1 = new Radio();
//		
//		TurnOn(r1);
//		
//		TurnOff(r1);
//		
//		Channel(r1,50);
		
		SmartTv t2 = new SmartTv();
		
		TurnOn(t2);
		Channel(t2,50);
		TurnOff(t2);
		
		Search(t2,"영화");
		
	}

}
