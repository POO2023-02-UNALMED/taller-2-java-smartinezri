package test;

public class Auto{
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	static int registro;
	public static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] == new Asiento()) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		String integridad = null;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i].registro == Auto.registro && Auto.registro == motor.registro) {
				integridad = "Auto original";
			}
			else {
				integridad = "Las piezas no son originales";
			}
		}
		return integridad;
	}
	
}