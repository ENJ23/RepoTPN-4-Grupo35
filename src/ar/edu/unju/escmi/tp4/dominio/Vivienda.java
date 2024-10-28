package ar.edu.unju.escmi.tp4.dominio;

public class Vivienda extends Inmueble {
    private String direccion;
	private int cantidadHabitaciones;
    //private boolean  estadoDisponibilidad;

    public Vivienda(int id, String nombre, String direccion, double precio, Inmobiliaria inmobiliaria, boolean estadoDisponibilidad, int cantidadHabitaciones) {
        super(id, nombre, precio, inmobiliaria, estadoDisponibilidad);
        this.direccion = direccion;
        this.cantidadHabitaciones = cantidadHabitaciones;
        //this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Vivienda [cantidadHabitaciones=" + cantidadHabitaciones + ", id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", precio="
				+ precio + ", inmobiliaria=");
        inmobiliaria.mostrarDatos();
        System.out.println("]");
    }

	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}

	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}


	public boolean isEstadoDisponibilidad() {
		return estadoDisponibilidad;
	}

	public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
		this.estadoDisponibilidad = estadoDisponibilidad;
	}


	
    
    
}