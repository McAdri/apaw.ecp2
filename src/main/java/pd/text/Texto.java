package pd.text;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.ObjectFactory;

public class Texto extends Escrito{

	public Texto(List<Componente> compenenteList){
		super(compenenteList);
	}
	
	public Texto(){
		this.compenenteList = new ArrayList<Componente>();
	}

	@Override
	public void add(Componente componente) {
		if(!componente.isCaracter()){
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
		return texto + "---o---\n";
	}

	@Override
	public void delete(Componente componente) {
		if(!componente.isCaracter()){
			this.compenenteList.remove(componente);
		} else{
			throw new UnsupportedOperationException();		}
		
	}

}
