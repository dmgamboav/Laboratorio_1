package carros;


public enum CarrosEnum {
   
  SEDAN("Sedan"),
  PICKUP("Pickup"),
  SUV("SUV");

	
	private final String nombre;//immutabilidad
	
	CarrosEnum(String nombre) {
	  this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
