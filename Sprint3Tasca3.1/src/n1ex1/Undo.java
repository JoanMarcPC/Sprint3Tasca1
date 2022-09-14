package n1ex1;

import java.util.ArrayList;

public class Undo {

	private static Undo instance;
	private ArrayList<String> commands;

	private Undo() {
		commands = new ArrayList<String>();
	}

	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	public ArrayList<String> getCommands() {
		return commands;
	}

	public void addCommands(String command) {
		if(this.commands.size()==50) { // guardo maxim les ultimes 50 commands
			this.commands.remove(0); // esborro la primera 
			this.commands.add(command);
		}else {
			this.commands.add(command);
		}
		
	}

	public void removeCommand(String command) {
		this.commands.clear();
	}
	public String getLastCommand() {
		if(commands.isEmpty()) {
		return "Command list empty";
	}
	return this.commands.get(this.commands.size());
}
}
