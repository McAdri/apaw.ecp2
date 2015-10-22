package pd.calculator.memento;

import pd.calculator.Calculator;
import pd.calculator.ComandoAbstract;
import upm.jbb.IO;

public class ComandoDeshacer extends ComandoAbstract{

	private GestorMementos<MementoCalculadora> gestorMementos;

	public ComandoDeshacer(Calculator calculator,GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public void execute() {
		 ((CalculatorMementable) calculator).restoreMemento(
	                this.gestorMementos.getMemento((String) IO.getIO().select(gestorMementos.keys(), "Restaurar")));
	}

	@Override
	public String name() {
		return "Deshacer";
	}

}
