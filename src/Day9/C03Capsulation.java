package Day9;


class ramenRecipe
{
	//순서
	private void step1()
	{
		System.out.println();
	}
	private void step2()
	{
		System.out.println();
	}
	private void step3()
	{
		System.out.println();
	}
	private void step4()
	{
		System.out.println();
	}
	
	public void cooking()
	{
		step1();
		step2();
		step3();
		step4();
	}
}

class Cook
{
	private ramenRecipe ramen = new ramenRecipe();
	
	void cook()
	{
		ramen.cooking();
	}
}


public class C03Capsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cook hong = new Cook();
		hong.cook();
		
	}

}
