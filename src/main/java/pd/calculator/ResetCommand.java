package pd.calculator;

public class ResetCommand extends ComandoAbstract{

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.calculator.reset();
	}

	@Override
	public String name() {
		return "Reset";
	}

}
