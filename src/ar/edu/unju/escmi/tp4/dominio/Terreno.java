package ar.edu.unju.escmi.tp4.dominio;

public class Terreno extends Inmueble {
	//private String codigoIdentificacion;
    private double latitud;
    private double longitud;
    private double superficie;
    //private boolean estadoDisponibilidad;

    public Terreno(int id, String nombre, double precio, Inmobiliaria inmobiliaria, boolean estadoDisponibilidad, double latitud, double longitud, double superficie) {
        super(id, nombre, precio, inmobiliaria,estadoDisponibilidad);
        //this.codigoIdentificacion = codigoIdentificacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.superficie = superficie;
        //this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Terreno [latitud=" + latitud + ", longitud=" + longitud + ", superficie=" + superficie
				+ ", id=" + id + ", nombre=" + nombre
				+ ", precio=" + precio + ", inmobiliaria=");
        inmobiliaria.mostrarDatos();
        System.out.println("]");
    }

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public boolean isEstadoDisponibilidad() {
		return estadoDisponibilidad;
	}

	public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
		this.estadoDisponibilidad = estadoDisponibilidad;
	}


	
    
    
}