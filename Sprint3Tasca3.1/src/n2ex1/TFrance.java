package n2ex1;

import java.util.Scanner;

public class TFrance implements Telephone {
//0x xx xx xx xx
	private String number;

	@Override
	public boolean formatCheck() {
		// TODO Auto-generated method stub
		String aux = this.number.replaceAll(" ", "").replaceAll("-", "");
		boolean isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?");
		boolean formatOK = false;

		if (aux.startsWith("+33")) {
			if (aux.length() == 13) {

				if (aux.startsWith("0", 3)) {
					formatOK = true;
				} else {
					System.out.println("Please enter a FR number starting with (+33 0 )");
				}
			} else {
				System.out.println("Please enter a FR number (+33 0X XX XX XX XX)");
			}
		} else {

			System.out.println("To enter a FR number you need to enter +33 first (country code)");

		}

		return isNumeric && formatOK;

	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "France";
	}

	@Override
	public void askForNumber() {
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter a French phone number + 33 0x xx xx xx x");
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
		return "TFrance [number=" + number + "]";
	}

}
