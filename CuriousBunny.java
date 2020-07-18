public class CuriousBunny extends Animal{

	//Constructor
	protected CuriousBunny(String name, String color){

		super(name, color);

	}

	//hop method

	protected void hop(){

		if (health>0) {
			System.out.println(name + " is hopping");
		}

		else
		{
			System.out.println(name +" is dead");
		}

	}
	
}


