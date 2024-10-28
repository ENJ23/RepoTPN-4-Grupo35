package ar.edu.unju.escmi.tp4.dominio;

public abstract class Inmueble {
	protected int id;
	protected String nombre;
    protected double precio;    
    protected Inmobiliaria inmobiliaria;
    protected boolean estadoDisponibilidad;
    
    public Inmueble(int id, String nombre, double precio, Inmobiliaria inmobiliaria, boolean estadoDisponibilidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.inmobiliaria = inmobiliaria;
		this.estadoDisponibilidad = estadoDisponibilidad;
	}


	public abstract void mostrarDatos();

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}


	public void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;
	}

	
	
	public boolean isEstadoDisponibilidad() {
		return estadoDisponibilidad;
	}


	public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
		this.estadoDisponibilidad = estadoDisponibilidad;
	}


	@Override
	public String toString() {
		return "Inmueble [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}