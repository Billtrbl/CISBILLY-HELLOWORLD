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
	
	public int getMilesTillNextPitStop(int distanceTraveled) // pit stop condition
	{
		int milesTillEmpty = 0;
		// solve for 2 test cases..
		
		return milesTillEmpty;
	}
	
	public static void main(String[] args)
	{
		
		// test case 1 : test miles left in car
		// if mpg is 20
		// if tanksize is 10 gallons
		// if car has gone 20 miles the tank should have 9 gallons
		
		int n = 9;
		
		Car Car1 = new Car(100,20,10);
		if(Car1.getMilesTillNextPitStop(20) == n) // pit stop
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}

	}

}
