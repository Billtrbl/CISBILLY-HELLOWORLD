package RaceCarAssignment;

public class Controller {

		// main method
		// test 2 test cases
		
		public static void main(String[] args)
		{
			// need to determine n
			int n = 5; 
			
			Car Car1 = new Car(100,20,10); // top speed, mpg, size of gas tank , TEST CASE 1
			if(Car1.getGasTillNextPitStop(100) >= n) // if the amount of gas left in the tank is more than or equal to 5 ...
			{
				System.out.println("Car1 Test Pass"); // car continues to race..
			}
			else
			{
				System.out.println("Car1 Test Fail"); // if not then car goes to pit-stop
			}
			
			// need to determine o
			int o = 4;
			
			Car Car2 = new Car(120,10,10); // top speed, mpg, size of gas tank , TEST CASE 2
			if(Car2.getGasTillNextPitStop(80) >= o) // if the amount of gas left in the tank is more than or equal to 4 ....
			{
				System.out.println("Car2 Test Pass"); // car continues to race ...
			}
			else
			{
				System.out.println("Car2 Test Fail"); // if not then car goes to pit-stop
			}
					
					
					
					
			// test case 1
			// if mpg is 20
			// if tanksize is 10 gallons
			// if car has gone 100 miles, should the car still goes on or goes to pit stop?
			
			// test case 2 
			// if mpg is 10
			// if tanksize is 10 gallons
			// if car has gone 100 miles, should the car still goes on or goes to pit stop?
		}
	 
		
		
	}

