package Day10;


class Controller
{
	Module module;
	
	void setModule(Module module)
	{
		this.module = module;
	}
	
	Module getModule()
	{
		return module;
	}
}

class Module
{
	Module()
	{
		System.out.println("Module생성 this : " + this);
	}
	void Func1()
	{
		System.out.println("Module's Func1()");
	}
	void Func2()
	{
		System.out.println("Module's Func2()");
	}
	void Func3()
	{
		System.out.println("Module's Func3()");
	}
}



public class C01FunctionRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controller cont1 = new Controller();
//		cont1.setModule(new Module());
		cont1.module.Func1();
		cont1.module.Func2();
		cont1.module.Func3();
		System.out.println("Controller module : " + cont1.getModule());
	}

}
