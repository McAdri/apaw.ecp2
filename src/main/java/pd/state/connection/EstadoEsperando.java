package pd.state.connection;

public class EstadoEsperando extends EstadoConexion{
	
	public EstadoEsperando(Conexion conexion){
		super(conexion);
	}
	
	@Override
	public void recibir(int num){
		if(num == 0){
			this.conexion.setEstado(new EstadoPreparado(this.conexion));
		}else{
			this.conexion.setEstado(new EstadoCerrado(this.conexion));
		}
	}

	@Override
	public Estado getEstado(){
		return Estado.ESPERANDO;
	}
}
