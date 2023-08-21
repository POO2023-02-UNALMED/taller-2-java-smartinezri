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
		for (int i = 0; i <= asientos.length; i++) {
			cantidad += 1;
		}
		return cantidad;
	}
	
	void verificarIntegridad() {
		if (Asiento.registro == Auto.registro && Auto.registro == motor.registro) {
			System.out.println("Auto original");
		}
		else {
			System.out.println("Las piezas no son originales");
		}
		
	}
	
}