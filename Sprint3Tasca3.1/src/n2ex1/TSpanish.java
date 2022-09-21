package n2ex1;

import java.util.Scanner;

public class TSpanish implements Telephone {
//9AX XX XX XX o 8AX XX XX XX fix 
	private String number;

	@Override
	public boolean formatCheck() {
		String aux = this.number.replaceAll(" ", "").replaceAll("-", "");
		boolean isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?");
		boolean formatOK = false;

		if (aux.startsWith("+34")) {
			if (aux.length() == 12) {

				if (aux.startsWith("9", 3) || aux.startsWith("8", 3) || aux.startsWith("7", 3)
						|| aux.startsWith("6", 3)) {
					formatOK = true;
				} else {
					System.out.println("Please enter a ESP number starting with (+34 [9-6] )");
				}
			} else {
				System.out.println("Please enter a ESP number (+34 XXX XX XX XX)");
			}
		} else {

			System.out.println("To enter a ESP number you need to enter +34 first (country code)");

		}

		return isNumeric && formatOK;

	}

	@Override
	public String getCountry() {
		return "Spain";
	}

	@Override
	public void askForNumber() {
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter a Spanish phone number  +34 XXX XX XX XX");
			Scanner input = new Scanner(System.in);
			this.setNumber(input.nextLine());

		} while (!this.formatCheck());
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "TSpanish [number=" + number + "]";
	}

}
