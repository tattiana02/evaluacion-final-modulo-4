package awl.modulo4.idao;

import java.util.List;

import awl.modulo4.model.Pago;

public interface IPagoDao {

	public boolean agregar(Pago pago);
	public List<Pago> listar();
	public boolean actualizar(Pago pago);
	public boolean eliminar (Pago pago);
	public Pago buscar(int pagoid);
	
}