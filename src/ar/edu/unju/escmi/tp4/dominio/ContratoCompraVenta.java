package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public class ContratoCompraVenta extends Contrato{

    private Terreno terreno; 
    private double impuestos;

 

    public ContratoCompraVenta(Cliente cliente, LocalDate fechaContrato, Inmobiliaria inmobiliaria, Terreno terreno,
			double impuestos) {
		super(cliente, fechaContrato, inmobiliaria);
		this.terreno = terreno;
		this.impuestos = impuestos;
	}

	public double montoTotal() {
        return terreno.precio + impuestos;
    }

    public void mostrarDatos() {
        System.out.println("Contrato de Compra Venta, Fecha: " + fechaContrato);
        terreno.mostrarDatos();
    }

	public Terreno getTerreno() {
		return terreno;
	}

	public void setTerreno(Terreno terreno) {
		this.terreno = terreno;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
    
    
}