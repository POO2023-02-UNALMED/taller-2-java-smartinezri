package test;

public class Auto{
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
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
		for (Asiento a : asientos) {
			if (a.registro != registro) {
				original = false;
			}
			
		if (registro != motor.registro) {
			original = false;
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