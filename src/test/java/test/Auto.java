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
		for (int i = 0; i <= asientos.length; i++) {
			cantidadCreados += 1;
		}
		return cantidadCreados;
	}
	
	String verificarIntegridad() {
		String integridad;
		if (Asiento.registro != Auto.registro || Asiento.registro != motor.registro || Auto.registro != motor.registro) {
			integridad = "Las piezas no son originales";
		}
		else {
			integridad = "Auto original";
		}
		return integridad;
	}
	
}