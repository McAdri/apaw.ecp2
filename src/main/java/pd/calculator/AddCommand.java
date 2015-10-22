package pd.calculator;

import upm.jbb.IO;

public class AddCommand extends ComandoAbstract{

	public AddCommand(Calculator calculator){
		super(calculator);
	}

	@Override
	public void execute() {
		this.calculator.add((int) IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "Sumar";
	}
}
