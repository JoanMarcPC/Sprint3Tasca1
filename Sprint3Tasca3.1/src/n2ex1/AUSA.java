package n2ex1;

import java.util.Scanner;

public class AUSA implements Adress {

	private String adress;

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "USA";
	}

	@Override
	public void askForAdress() {
		// TODO Auto-generated method stub
		System.out.println("Enter a Spanish Adress (street, number, apartment, zip code, city)");
		Scanner input = new Scanner(System.in);
		this.setAdress(input.nextLine());
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "AUSA [adress=" + adress + "]";
	}

}
