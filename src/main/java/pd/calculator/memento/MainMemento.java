package pd.calculator.memento;

import pd.calculator.AddCommand;
import pd.calculator.CommandManager;
import pd.calculator.PrintCommand;
import pd.calculator.ResetCommand;
import pd.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainMemento {

	private CommandManager commandManager;
	
	private GestorMementos<MementoCalculadora> gestorMementos = new GestorMementos<MementoCalculadora>();
	
	public MainMemento() {
	        CalculatorMementable calculator = new CalculatorMementable();
	        this.commandManager = new CommandManager();
	        this.commandManager.add(new AddCommand(calculator));
	        this.commandManager.add(new SubtractCommand(calculator));
	        this.commandManager.add(new ResetCommand(calculator));
	        this.commandManager.add(new PrintCommand(calculator));
	        this.commandManager.add(new ComandoGuardar(calculator,gestorMementos));
	        this.commandManager.add(new ComandoDeshacer(calculator,gestorMementos));
	    }
	
	public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainMemento());
    }
}
