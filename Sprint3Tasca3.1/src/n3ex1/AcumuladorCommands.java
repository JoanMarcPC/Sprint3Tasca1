package n3ex1;

import java.util.ArrayList;

public class AcumuladorCommands {
	private ArrayList<Command> commands;

	public AcumuladorCommands(ArrayList<Command> commands) {
		super();
		this.commands = commands;
	}

	public ArrayList<Command> getCommands() {
		return commands;
	}

	public void setCommands(ArrayList<Command> commands) {
		this.commands = commands;
	}

	public void execute() {
		for (int i = 0; i < this.commands.size(); i++) {

			commands.get(i).execute();
		}
	}

	@Override
	public String toString() {
		return "AcumuladorCommands [commands=" + commands + "]";
	}

}
