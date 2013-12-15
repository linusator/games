package de.linusoft.games.quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quiz {

	public static void main(String[] args) throws IOException {
		BufferedReader console = new BufferedReader(new InputStreamReader(
				System.in));
		int durchlauf = 0;
		String standartsatz;
		standartsatz = "Gebe \"start\" zum erneutem Starten des Quiz oder \"exit\" bzw. \"ende\" zum schließen ein.";
		boolean beenden = false;
		while (!beenden) {
			if (durchlauf == 0) {
				System.out
						.println("Hallo. Gebe \"start\" zum Starten des Quiz oder \"exit\" bzw. \"ende\" zum schließen ein. Bitte Antworte mit Lösungsbuchstaben.");
			} else if (durchlauf > 0) {
				System.out.println(standartsatz);
			}
			String commando = console.readLine();

			if (commando.toLowerCase().equals("ende")
					|| commando.toLowerCase().equals("exit")) {
				beenden = true;
				if (durchlauf == 0) {
					System.out.println("Auf Wiedersehen!");
				} else {
					System.out
							.println("Auf Wiedersehen und danke für's mitmachen!");
				}
			}

			if (commando.toLowerCase().equals("start")) {
				System.out
						.println("Frage 1: Was würde ein Naturschützer am ehesten sagen?");
				System.out
						.println("A: Zwiebel, B: Meerrettich, C: Tomate oder D: Paprika?");
				String commando1 = console.readLine();
				if (commando1.toLowerCase().equals("b")) {
					System.out.println("Richtig!");
					System.out
							.println("Frage 2: Wie viele Menschen leben auf der Erde?");
					System.out
							.println("A: 60 milliarden, B: 4 milliarden, C: 7000 millionen oder D: 7 millionen?");
					String commando2 = console.readLine();
					if (commando2.toLowerCase().equals("c")) {
						System.out.println("Richtig!");
					} else {
						System.out
								.println("Leider falsch. Auf Wiedersehen und danke für's mitmachen!");
					}
				} else {
					System.out
							.println("Leider falsch. Auf Wiedersehen und danke für's mitmachen!");
				}
			}
			System.out
					.println("Leider ist das Quiz noch sehr kurz. Es sind aber ein GUI sowie mehr Fragen in Planung. Vielen Dank fürs mitmachen!");
			System.out
					.println("Bitte bewerte das Quiz. 1 Stern, 2 Sterne, 3 Sterne oder 4 Sterne?");
			String commando3 = console.readLine();
			if (commando3.toLowerCase().equals("4 sterne")) {
				System.out.println("Richtig!");
				// bei folgenden Kommandos könnte man mit Variablen arbeiten
			} else if (commando3.toLowerCase().equals("3 sterne")) {
				System.out
						.println("Nein Mann! Das Quiz ist viel besser als deine doofen 3 Sterne! ;D");
			} else if (commando3.toLowerCase().equals("2 sterne")) {
				System.out
						.println("Nein Mann! Das Quiz ist viel besser als deine doofen 2 Sterne! ;D");
			} else if (commando3.toLowerCase().equals("1 stern")) {
				System.out
						.println("Nein Mann! Das Quiz ist viel besser als dein doofer 1 Stern! ;D");
			}
			durchlauf++;
		}
	}
}