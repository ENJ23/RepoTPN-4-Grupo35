package ar.edu.unju.escmi.tp4.dominio;

import java.time.LocalDate;

public abstract class Contrato {
	protected Cliente cliente;
    protected LocalDate fechaContrato; 
    protected Inmobiliaria inmobiliaria;



    public Contrato(Cliente cliente, LocalDate fechaContrato, Inmobiliaria inmobiliaria) {
		this.cliente = cliente;
		this.fechaContrato = fechaContrato;
		this.inmobiliaria = inmobiliaria;
	}

	public abstract void mostrarDatos();
    
    public abstract double montoTotal();

	public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

	public Inmobiliaria getInmobiliaria() {
		return inmobiliaria;
	}

	public void setInmobiliaria(Inmobiliaria inmobiliaria) {
		this.inmobiliaria = inmobiliaria;
	}
    
    
}