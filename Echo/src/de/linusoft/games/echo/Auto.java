package de.linusoft.games.echo;



public class Auto {
	
	
	private Getriebe getriebe;
	private Farbe farbe;
	private Motor motor;
	private Hersteller hersteller;


	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Auto(Getriebe pGetriebe, Farbe pFarbe, Hersteller pHersteller) {
		getriebe = pGetriebe;
		farbe = pFarbe;
		hersteller = pHersteller;
	}
	
	public Farbe getFarbe() {
		return farbe;
	}

	public Getriebe getGetriebe() {
		return getriebe;
	}
	
	public Hersteller getHersteller() {
		return hersteller;
	}

}
