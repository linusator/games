package de.linusoft.games.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autospiel {
	
	public static void main(String[] args) throws IOException {
		Auto linusAuto = new Auto(Getriebe.MANUELLE, Farbe.WEISSE, Hersteller.BMW);
		Auto papasAuto = new Auto(Getriebe.AUTOMATISCHE, Farbe.SCHWARZE, Hersteller.FIAT);		
		Auto inkasAuto = new Auto(Getriebe.AUTOMATISCHE, Farbe.KACKBRAUNE, Hersteller.VESPA);
		Auto opasAuto = new Auto(Getriebe.AUTOMATISCHE, Farbe.SILBERNE, Hersteller.MERCEDES);
		linusAuto.setMotor(new Motor(12,250,100));
		inkasAuto.setMotor(new Motor(4,10,50));
		papasAuto.setMotor(new Motor(6,150,200));
		opasAuto.setMotor(new Motor(4,200,150));
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Wie heisst Du: ");
			
		String name = console.readLine();
		
		Auto auto = null;
		if (name.toLowerCase().equals("papa")) {
			auto = papasAuto;
		} else  if (name.toLowerCase().equals("linus")) {
			auto = linusAuto;
		} else  if (name.toLowerCase().equals("inka")) {
			auto = inkasAuto;
		} else  if (name.toLowerCase().equals("opa")) {
			auto = opasAuto;
		} else  if (name.toLowerCase().equals("reinhard")) {
			auto = opasAuto;
		} 
		
		if (auto!=null) {
			System.out.println("Dein Auto hat eine "+auto.getFarbe()+" Farbe.");
			System.out.println("Dein Auto ist vom Hersteller: "+auto.getHersteller());
			System.out.println("Dein Auto hat eine "+auto.getGetriebe()+" Schaltung.");
			System.out.println("Dein Auto verbraucht "+auto.getMotor().co2+"g co2 pro Kubikmeter.");
			System.out.println("Dein Auto hat eine Leistung von "+auto.getMotor().kw+"kw.");
			System.out.println("Dein Auto hat "+auto.getMotor().zylinder+" Zylinder.");
		}
		
	}

}