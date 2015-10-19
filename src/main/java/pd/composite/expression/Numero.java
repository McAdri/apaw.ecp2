package pd.composite.expression;

import org.hamcrest.core.IsNot;

public class Numero extends Expresion{

	private int numero;
	
	public Numero(int numero){
		this.numero = numero;
	}
	
	@Override
	public int operar(){
		return this.numero;
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.numero);
	}
}
