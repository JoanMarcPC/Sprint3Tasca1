package n1ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aux;
		if (args.length == 0) {
			System.out.println("Has d'introduir alguna comanda. Es tancarà l'apliació");
			System.exit(0);
		}

		Undo objectSingleton = Undo.getInstance();

		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("show")) {
				System.out.println(objectSingleton.getCommands());
			} else if (args[i].startsWith("remove")) {
				aux = args[i].replaceAll("remove", "");
				aux = aux.trim();
				objectSingleton.removeCommand(aux);
				
			}else {
				objectSingleton.addCommands(args[i]);
			}
		}

	}

}
