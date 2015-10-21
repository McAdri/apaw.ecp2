package pd.text;

public class Caracter extends Componente{

	private char caracter;

	public Caracter(char caracter) {
		super();
		this.caracter = caracter;
	}
	
	@Override
	public void add(Componente componente) throws UnsupportedOperationException{		
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		
		return String.valueOf(mayusculas ? Character.toUpperCase(caracter) : caracter);
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException{		
	}

	@Override
	public boolean isCaracter() {
		return true;
	}
}
