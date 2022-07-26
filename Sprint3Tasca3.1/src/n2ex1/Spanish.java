package n2ex1;

public class Spanish implements Telephone{
//9AX XX XX XX o 8AX XX XX XX fix 
	@Override
	public	boolean  formatCheck(String num){
		String aux = num.replaceAll(" ", "").replaceAll("-", "");	
		boolean isNumeric = aux.matches("[+-]?\\d*(\\.\\d+)?");
		boolean formatOK = false;
		
		if(aux.startsWith("+34")) {
			if(aux.length()== 12) {
				
				if(aux.startsWith("9", 3)||aux.startsWith("8", 3)||aux.startsWith("7", 3)||aux.startsWith("6", 3)){
					formatOK = true;
				}else {
					System.out.println("Please enter a ESP number starting with (+34 [9-6] )");
				}
			}else {
				System.out.println("Please enter a ESP number (+34 XXX XX XX XX)");
			}
		}else{
			
			System.out.println("To enter a ESP number you need to enter +34 first (country code)");
			
		}
		
		
		System.out.println(isNumeric);
		return isNumeric && formatOK;
		
	}
	@Override
	public String getCountry() {
		return "Spain";
	}
}
