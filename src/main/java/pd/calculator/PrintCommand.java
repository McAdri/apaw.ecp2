package pd.calculator;

import upm.jbb.IO;

public class PrintCommand extends ComandoAbstract{

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		IO.getIO().print(calculator.getTotal());
	}

	@Override
	public String name() {
		return "Print";
	}

}
