package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public class ContratoAlquiler extends Contrato{
	
	private int duracion;
    private double precio;
    private double gastosInmobiliaria;
    private Vivienda vivienda;
    
	
	public ContratoAlquiler(Cliente cliente, LocalDate fechaContrato, Inmobiliaria inmobiliaria, int duracion, double precio, double gastosInmobiliaria, Vivienda vivienda) {
		super(cliente, fechaContrato, inmobiliaria);
		this.duracion = duracion;
		this.precio = precio;
		this.gastosInmobiliaria = gastosInmobiliaria;
		this.vivienda = vivienda;
	}

	
	public double montoTotal() {
        return precio + gastosInmobiliaria;
    }

    public void mostrarDatos() {
        System.out.println("Contrato de Alquiler: " + duracion + ", Precio: " + precio + ", Gastos: " + gastosInmobiliaria);
        vivienda.mostrarDatos();
    }

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getGastosInmobiliaria() {
		return gastosInmobiliaria;
	}

	public void setGastosInmobiliaria(double gastosInmobiliaria) {
		this.gastosInmobiliaria = gastosInmobiliaria;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	
    
    
}