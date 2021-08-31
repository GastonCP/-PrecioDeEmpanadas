//Docena -> $800, Unidad -> $80

package EmpanadasPakage;

class Empanadas {
	
	private int cantidad;

	public Empanadas (int cantidad) {
		setCantidadDeEmpanadas(cantidad);
	}
	
	public Empanadas() {
		this.cantidad = 18;
	}
	
	private boolean esCantidadCorrecta (int cantidad) {
		return (cantidad > 0);
	}
	
	private void setCantidadDeEmpanadas (int cantidad) {
		if (!esCantidadCorrecta(cantidad)) {
			Error notaInvalida = new Error("Cantidad Invalidad(<=0)");
			throw notaInvalida;
		}
		this.cantidad = cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public int precioEmpanadas(){
		return (((this.cantidad/12)*800)+((this.cantidad%12)*80));
	}
} 
