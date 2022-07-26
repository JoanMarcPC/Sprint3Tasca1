package n2ex1;

public class France implements Telephone {
//0x xx xx xx xx
	@Override
	public boolean formatCheck(String num) {
		// TODO Auto-generated method stub
		String aux = num.replaceAll(" ", "").replaceAll("-", "");	
		boolean isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?");
		boolean formatOK = false;
		
		if(aux.startsWith("+33")) {
			if(aux.length()== 13) {
				
				if(aux.startsWith("0", 3)){
					formatOK = true;
				}else {
					System.out.println("Please enter a FR number starting with (+33 0 )");
				}
			}else {
				System.out.println("Please enter a FR number (+33 0X XX XX XX XX)");
			}
		}else{
			
			System.out.println("To enter a FR number you need to enter +33 first (country code)");
			
		}
		
		
		System.out.println(isNumeric);
		return isNumeric && formatOK;
		
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "France";
	}

}
