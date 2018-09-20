package ClassAssignmentsWeek2;
public class Car2 {

	public static void main(String[] args) 
	{
		Car1 u1 = new Car1();
		u1.setCarWheels("MR122");
		u1.setWiperBlades("Raineater");
		u1.setBrakePads("StopTech");
		u1.setFloorMatts("WeatherTech");
		u1.SetHeadLights("SNGL");
		u1.setCarBattery("Optima");
		
		Car1 u2 = new Car1();
		u2.setCarWheels("MR224");
		u2.setWiperBlades("Bosch");
		u2.setBrakePads("Akebono");
		u2.setFloorMatts("Husky");
		u2.SetHeadLights("Phillips");
		u2.setCarBattery("ACDelco");
		
		Car1 u3 = new Car1();
		u3.setCarWheels("AR895");
		u3.setWiperBlades("ANCO");
		u3.setBrakePads("Raybestos");
		u3.setFloorMatts("Hexomat");
		u3.SetHeadLights("SYLVANIA");
		u3.setCarBattery("Odyssey");
		
		System.out.println(u1.getCarBattery());
		
		System.out.println(u2.getFloorMatts());
		
		System.out.println(u3.getBrakePads());
		
		System.out.println(u1.getCarWheels());
		
		System.out.println(u2.getWiperBlades());
		
		System.out.println(u3.getWiperBlades());
		
	}

}
