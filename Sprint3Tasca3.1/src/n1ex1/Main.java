package n1ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> commands = new ArrayList<String>();
		commands.clear();
		String command;
		Scanner entrada = new Scanner(System.in);
		Undo objectSingleton = Undo.getInstance();
		System.out.println(
				"Comandos disponibles:\n - last: ver ultimo command\n - show: ver todos los commands guardados\n - remove: borrar todos los commands guardados\n - exit: salir\n Cualquier otra palabra se guardara como comando");
		// si no posa cap de les opcions de comandes, s'ent�n que es una comanda normal
		// i ha de ser guardada.

		do {

			command = entrada.nextLine();
			switch (command) {
			case "last":
				System.out.println(objectSingleton.getLastCommand());
				break;
			case "show":
				System.out.println(objectSingleton.getCommands().toString());
				break;
			case "remove":
				System.out.println("Lista de comandos borrada");
				break;
			case "exit":
				break;
			default:
				objectSingleton.addCommands(command);
				break;
			}
		} while (command != "exit");
		entrada.close();
	}

}
