package pd.calculator;

import upm.jbb.IO;

public class SubtractCommand extends ComandoAbstract{

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.calculator.subtract((int) IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "Subtract";
	}

}
