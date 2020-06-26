package awl.modulo4.model;

public class Visita {

	private int idvisita;
	private String direccion;
	private String ciudad;
	private String fecha;
	private String resumen;
	private String observaciones;
	private int clienteid;
	private int empleadoid;
	
	
	
	public Visita(String direccion, String ciudad, String fecha, String resumen, String observaciones, int clienteid,
			int empleadoid) {
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.fecha = fecha;
		this.resumen = resumen;
		this.observaciones = observaciones;
		this.clienteid = clienteid;
		this.empleadoid = empleadoid;
	}



	public int getIdvisita() {
		return idvisita;
	}



	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getResumen() {
		return resumen;
	}



	public void setResumen(String resumen) {
		this.resumen = resumen;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public int getClienteid() {
		return clienteid;
	}



	public void setClienteid(int clienteid) {
		this.clienteid = clienteid;
	}



	public int getEmpleadoid() {
		return empleadoid;
	}



	public void setEmpleadoid(int empleadoid) {
		this.empleadoid = empleadoid;
	}



	@Override
	public String toString() {
		return "Visita [idvisita=" + idvisita + ", direccion=" + direccion + ", ciudad=" + ciudad + ", fecha=" + fecha
				+ ", resumen=" + resumen + ", observaciones=" + observaciones + ", clienteid=" + clienteid
				+ ", empleadoid=" + empleadoid + "]";
	}
	
	
	
	
}
