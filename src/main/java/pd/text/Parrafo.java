package pd.text;

import java.util.ArrayList;
import java.util.List;

public class Parrafo extends Escrito{

	public Parrafo(List<Componente> compenenteList){
		super(compenenteList);
	}
	
	public Parrafo(){
		this.compenenteList = new ArrayList<Componente>();
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException{
		if(componente.isCaracter()){
			this.compenenteList.add(componente);

		} else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String dibujar(Boolean mayusculas) {
		String texto = "";
		
		for(int i=0;i<this.compenenteList.size(); i++){
			texto = texto + this.compenenteList.get(i).dibujar(mayusculas);
		}
		return texto + "\n";
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException{	
		if(componente.isCaracter()){
			this.compenenteList.remove(componente);

		} else{
			throw new UnsupportedOperationException();
		}
	}

}
