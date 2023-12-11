
public class Clientes {
	private String nombre,app;
	private int edad;
	private long telefono,saldo;
	
	
	
	///CONSTRUCTOR VACIO
	public Clientes() {
		super();
	}



	public Clientes(String nombre, String app, int edad, long telefono, long saldo) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.telefono = telefono;
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		return "Clientes [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", telefono=" + telefono + ", saldo="
				+ saldo + "]\n";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApp() {
		return app;
	}



	public void setApp(String app) {
		this.app = app;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public long getTelefono() {
		return telefono;
	}



	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}



	public long getSaldo() {
		return saldo;
	}



	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
}
