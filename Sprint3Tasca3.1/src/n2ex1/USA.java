package n2ex1;

public class USA implements Telephone {
	// +1 XXX XXX XXXX
	@Override
	public boolean formatCheck(String num) {
		// TODO Auto-generated method stub
		String aux = num.replaceAll(" ", "").replaceAll("-", "");
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

		System.out.println(isNumeric);
		return isNumeric && formatOK;
	}

	@Override
	public String getCountry() {
		return "USA";
	}

}
