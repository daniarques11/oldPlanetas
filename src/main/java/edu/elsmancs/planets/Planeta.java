package edu.elsmancs.planets;

public enum Planeta {
	
	
	MERCURY (3.303e+23, 2.4397e6),     
	VENUS   (4.869e+24, 6.0518e6),     
	EARTH   (5.976e+24, 6.37814e6),     
	MARS    (6.421e+23, 3.3972e6),     
	JUPITER (1.9e+27,   7.1492e7),     
	SATURN  (5.688e+26, 6.0268e7),     
	URANUS  (8.686e+25, 2.5559e7),     
	NEPTUNE (1.024e+26, 2.4746e7);
	
	private double G = 6.67300E-11;
	private final double weight;
	private final double radius;
	private final double gravityOnSurface;
	
	
	private Planeta(double weight, double radius) {
		this.weight = weight;
		this.radius = radius;
		this.gravityOnSurface = G * weight / radius;
	}


	public double pesoSuperficie(double peso) {
		return 0;
	}
	 
}
