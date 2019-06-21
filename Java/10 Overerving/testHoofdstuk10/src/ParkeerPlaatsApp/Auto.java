package ParkeerPlaatsApp;

public abstract class Auto {
	
	private String brandName;
	private double gewicht;
	
	
	
	public Auto(String brandName, double gewicht) {
		super();
		this.brandName = brandName;
		this.gewicht = gewicht;
	}
	
	public Auto(Auto autoIn) {
		this.brandName = autoIn.brandName;
		this.gewicht = autoIn.gewicht;
	}

	public abstract void reFuel();
		
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return brandName + "(" + gewicht + ")";
	}
	
	
	
	
	

}
