package pd.state.connection;

public class EstadoCerrado extends EstadoConexion{

	public EstadoCerrado(Conexion conexion){
		super(conexion);
	}

	@Override
	public void abrir(){
		this.conexion.setEstado(new EstadoPreparado(this.conexion));
	}

	@Override
	public void cerrar(){
	}

	@Override
	public Estado getEstado(){
		return Estado.CERRADO;
	}
}
