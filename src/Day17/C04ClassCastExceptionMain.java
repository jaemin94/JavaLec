package Day17;

class Animal
{
	
}

class Dog extends Animal
{
	
}

class Cat extends Animal
{

}



public class C04ClassCastExceptionMain {

	public static void ChangeDog(Animal animal)
	{
		try 
		{
			Dog down = (Dog)animal;
		}
		catch(ClassCastException ex)
		{
			System.out.println("Cast예외 발생!");
		}
	}
	
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		
		Animal cat = new Cat();
		
		ChangeDog(dog);
		ChangeDog(cat);
		
	}

}
