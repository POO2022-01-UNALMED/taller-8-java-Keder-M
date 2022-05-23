package futbol;


public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	//Constructores
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	///////////////
	
	public String toString() {
		return "El futbolista " + nombre + 
				" tiene " + edad + 
				", y juega de " + posicion;
	}
	
	public boolean equals(Futbolista futbolista) {
		return this == futbolista;
	}
	
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public String getPosicion() {
		return posicion;
	}
}
