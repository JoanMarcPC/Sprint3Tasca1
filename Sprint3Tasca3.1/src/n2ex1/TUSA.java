package n2ex1;

import java.util.Scanner;

public class TUSA implements Telephone {
	// +1 XXX XXX XXXX
	private String number;

	@Override
	public boolean formatCheck() {
		// TODO Auto-generated method stub
		String aux = this.number.replaceAll(" ", "").replaceAll("-", "");
		boolean isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?");
		boolean formatOK = false;

		if (aux.startsWith("+1")) {
			if (aux.length() == 12) {
				formatOK = true;
			} else {
				System.out.println("Please enter a US number (+1 XXX XXX XXXX)");
			}
		} else {

			System.out.println("to enter a US number you need to enter +1 first ");

		}

		return isNumeric && formatOK;
	}

	@Override
	public String getCountry() {
		return "USA";
	}

	@Override
	public void askForNumber() {
		// TODO Auto-generated method stub
		do {

			System.out.println("Enter a USA phone number");
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
		return "TUSA [number=" + number + "]";
	}

}
