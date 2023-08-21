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
			if (asientos[i] != null) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		boolean original = true;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i].registro != registro || asientos[i].registro != motor.registro) {
				original = false;
				break;
			}
		}
		if (original == true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
	
}