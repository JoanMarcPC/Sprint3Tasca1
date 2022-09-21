package n2ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String aux;
		Agenda agenda = new Agenda();

		do {
			System.out.println("Do you want to enter an address(a) or a phone number(p)? (e) to exit");
			aux = input.nextLine();
			if (aux.equalsIgnoreCase("a")) {
				System.out.println("Which country? (s) spain (u) usa (f) france");
				switch (input.nextLine()) {
				case "s":
					ASpanish Sadress = new ASpanish();
					Sadress.askForAdress();
					agenda.addAdress(Sadress);
					break;

				case "u":
					AUSA Uadress = new AUSA();
					Uadress.askForAdress();
					agenda.addAdress(Uadress);
					break;

				case "f":
					AFrance Fadress = new AFrance();
					Fadress.askForAdress();
					agenda.addAdress(Fadress);
					break;
				}
			} else if (aux.equalsIgnoreCase("p")) {
				System.out.println("Which country? (s) spain (u) usa (f) france");
				switch (input.nextLine()) {
				case "s":
					TSpanish Sphone = new TSpanish();
					Sphone.askForNumber();
					agenda.addTelephone(Sphone);
					break;

				case "u":
					TUSA Uphone = new TUSA();
					Uphone.askForNumber();
					agenda.addTelephone(Uphone);
					break;
				case "f":
					TFrance Fphone = new TFrance();
					Fphone.askForNumber();
					agenda.addTelephone(Fphone);
					break;
				}
			}
		} while (!aux.equalsIgnoreCase("e"));
		// TODO Auto-generated method stub
		
		System.out.println(agenda.toString());

	}

}
