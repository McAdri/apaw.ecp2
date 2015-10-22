package pd.calculator.memento;

import pd.calculator.Calculator;
import pd.calculator.ComandoAbstract;
import upm.jbb.IO;;

public class ComandoGuardar extends ComandoAbstract{

	private GestorMementos<MementoCalculadora> gestorMementos;
	
	public ComandoGuardar(Calculator calculator, GestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator);
		this.gestorMementos = gestorMementos;
}

	@Override
	public void execute() {
		gestorMementos.addMemento(IO.getIO().readString("Memento"),
                ((CalculatorMementable) calculator).createMemento());	
	}
	
	@Override
	public String name() {
		return "Guardar";
	}

}
