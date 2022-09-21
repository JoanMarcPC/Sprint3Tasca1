package n2ex1;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Adress> adress = new ArrayList<Adress>();
	private ArrayList<Telephone> phone = new ArrayList<Telephone>();

	public ArrayList<Adress> getAdress() {
		return adress;
	}

	public void addAdress(Adress adress) {
		this.adress.add(adress);
	}

	public void addTelephone(Telephone phone) {
		this.phone.add(phone);
	}

	public void setAdress(ArrayList<Adress> adress) {
		this.adress = adress;
	}

	public ArrayList<Telephone> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Telephone> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		String acum = "";
		for (int i = 0; i < adress.size(); i++) {
			acum += " Adress " + adress.toString();
		}
		for (int i = 0; i < phone.size(); i++) {
			acum += " Phone " + phone.toString();
		}
		return acum;
	}

}
