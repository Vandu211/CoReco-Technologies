package task.com;

public class RadiactiveMaterial {

	public static void main(String[] args) {

		double mass=200;
		double years=5.0;
		double halflives=3;
		
		remainingmass(mass,halflives);
		totalYears(years,halflives);
		
		
	}
	
	public static void remainingmass(double mass,double halflives)
	{
		double remass=mass*Math.pow(0.5, halflives);
		System.out.println("the remaining mass is "+ remass+ " grams");
	}
	
	public static void totalYears(double years ,double halflives)
	{
		double toyears=halflives*years;
		System.out.println("The number of years required to decay the material is "+ toyears + " years");
	}

}
