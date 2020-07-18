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
        private Coordinate coordinate;
	
	public Coordinate getCoordinate(){
		return coordinate;	
	}
	
	public void setCoordinate(){
	
		Coordinate coordinate = new Coordinate(0,0);
		this.coordinate = coordinate;
	}
	
	public void setLocation(int x,int y){
	
		if(!(x<0&&x>500&&y<0&&y>1000)){
			this.coordinate.setX(x);
			this.coordinate.setY(y);
		}
		else{
			System.out.println("you set a wrong position");
		}
	}
}


