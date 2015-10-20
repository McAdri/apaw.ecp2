package pd.state.connection;

public abstract class EstadoConexion {

	protected Conexion conexion;
	
	public EstadoConexion(Conexion conexion){
		this.conexion=conexion;
	}
	
	public void parar(){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void iniciar(){
		throw new UnsupportedOperationException("Acción no permitida");
	}

	public void abrir(){
		throw new UnsupportedOperationException("Acción no permitida");
	}

	public void cerrar(){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public void recibir(int num){
		throw new UnsupportedOperationException("Acción no permitida");
	}

	public void enviar(String string){
		throw new UnsupportedOperationException("Acción no permitida");
	}
	
	public Estado getEstado(){
		throw new UnsupportedOperationException("Acción no permitida");
	}

}
