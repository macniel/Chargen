package model;

public class Erfahrungsgrad {

	private String name;
	
	private int ap;
	private int maxEigenschaft;
	private int maxFertigkeit;
	private int maxKampfwertFertigkeit;
	private int maxEigenschaftspunkte;
	private int maxZauber;
	private int maxFremdZauber;
	
	public Erfahrungsgrad(String name, 
			int ap, 
			int maxEigenschaft, 
			int maxFertigkeit, 
			int maxKampfwertFertigkeit,
			int maxEigenschaftspunkte,
			int maxZauber,
			int maxFremdZauber) {
		this.name = name;
		this.ap = ap;
		this.maxEigenschaft = maxEigenschaft;
		this.maxEigenschaftspunkte = maxEigenschaftspunkte;
		this.maxFertigkeit = maxFertigkeit;
		this.maxKampfwertFertigkeit = maxKampfwertFertigkeit;
		this.maxZauber = maxZauber;
		this.maxFremdZauber = maxFremdZauber;
	}
	
	
	public int getAp() {
		return ap;
	}
	
	public int getMaxEigenschaft() {
		return maxEigenschaft;
	}
	
	public int getMaxEigenschaftspunkte() {
		return maxEigenschaftspunkte;
	}
	
	public int getMaxFertigkeit() {
		return maxFertigkeit;
	}
	
	public int getMaxFremdZauber() {
		return maxFremdZauber;
	}
	
	public int getMaxKampfwertFertigkeit() {
		return maxKampfwertFertigkeit;
	}
	
	public int getMaxZauber() {
		return maxZauber;
	}
	
	
	
	
	@Override
	public String toString() {
		return name;
	}
	
}
