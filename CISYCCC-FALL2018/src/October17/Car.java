package October17;

public class Car {
	
	// car object ; top speed ; acceleration ; fuel tank size ; MPG ; pit stop duration
	
	private int topSpeed;
	private int mpg;
	private int tankSize;
	
	public Car(int topSpeed, int mpg, int tankSize)
	{
		this.topSpeed = topSpeed;
		this.mpg = mpg;
		this.tankSize = tankSize; 
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	
	public int getMilesTillNextPitStop(int distanceTraveled)
	{
			// if()
				// if tank is below 5 , car goes to pit stop
				// top-speed / miles per gallon
			
			// else car keeps going
		
		return 0;
	}
	
	private static void main(String[] args)
	{
		// need to determine n
		int n = 0;
		
		Car Toyota = new Car(140,20,35);
		if(Toyota.getMilesTillNextPitStop(30) == n)
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		Car Honda = new Car(125,25,40);

		
		Car Nissan = new Car(180,15,20);

	}

}
