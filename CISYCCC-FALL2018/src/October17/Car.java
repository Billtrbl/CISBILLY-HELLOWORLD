package October17;

public class Car {
	
	// car object ; top speed ; acceleration ; fuel tank size ; MPG ; pit stop duration
	
	private int topSpeed;
	private int mpg;
	private int tankSize;
	int gasTillTankEmpty;
	
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
	
	public int getGasTillNextPitStop(int distanceTraveled) // miles the car travels
	{
		gasTillTankEmpty = tankSize - (distanceTraveled / mpg); // formula for figuring out how much gallons left in the tank after traveling a certain distance
		
		return gasTillTankEmpty;
	}
	
	
}
