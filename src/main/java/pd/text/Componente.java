package pd.text;

public abstract class Componente {

	public abstract void add(Componente componente) throws UnsupportedOperationException;
	public abstract String dibujar(Boolean mayusculas);
	public abstract void delete(Componente componente) throws UnsupportedOperationException;
	public boolean isCaracter(){
		return false;
	}
}
