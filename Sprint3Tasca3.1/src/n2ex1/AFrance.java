package n2ex1;

import java.util.Scanner;

public class AFrance implements Adress {
	private String adress;

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "France";
	}

	@Override
	public void askForAdress() {
		System.out.println("Enter a French Adress ( number, street, zip code, city, country)");
		Scanner input = new Scanner(System.in);
		this.setAdress(input.nextLine());
		// TODO Auto-generated method stub

	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "AFrance [adress=" + adress + "]";
	}

}
