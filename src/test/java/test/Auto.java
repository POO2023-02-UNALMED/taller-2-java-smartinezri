package test;

public class Auto{
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	static int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int i = 0; i <= asientos.length; i++) {
			cantidad += 1;
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		String integridad;
		if (Asiento.registro == Auto.registro && Auto.registro == motor.registro) {
			integridad = "Auto original";
		}
		else {
			integridad = "Las piezas no son originales";
		}
		return integridad;
	}
	
}