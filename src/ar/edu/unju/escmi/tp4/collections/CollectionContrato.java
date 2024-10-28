package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;

import ar.edu.unju.escmi.tp4.dominio.Contrato;
import ar.edu.unju.escmi.tp4.dominio.ContratoAlquiler;
import ar.edu.unju.escmi.tp4.dominio.ContratoCompraVenta;

public class CollectionContrato {
    public static ArrayList<Contrato> contratos = new ArrayList<>();

    public static void agregarContrato(Contrato contrato) {
        contratos.add(contrato);
    }


    public static void mostrarContratosAlquiler() {
    	
    	if (contratos.isEmpty()) {
    		System.out.println("No hay contratos de Alquiler registrados...");
    	}else {
	        for (Contrato contrato : contratos) {
	        	if (ContratoAlquiler.class.isInstance(contrato)) {
	        		ContratoAlquiler nuevoContrato = (ContratoAlquiler) contrato; 
	            System.out.println("Contrato de Alquiler: " + "Codigo: "+ nuevoContrato.getVivienda().getId() + " por $" + contrato.montoTotal());
	        	}
	        }
    	}
    }
    
    public static void mostrarContratosCompraVenta() {
    	if (contratos.isEmpty()) {
    		System.out.println("No hay contratos de Compra registrados...");
    		
    	}else {
    		
	    	for (Contrato contrato : contratos) {
	    		if (ContratoCompraVenta.class.isInstance(contrato)) {
	    			ContratoCompraVenta contratoNuevo = (ContratoCompraVenta) contrato;
	            System.out.println("Contrato de Compra: " + "Codigo: " + contratoNuevo.getTerreno().getId() + " por $" + contrato.montoTotal());
	    			}
	    		}
    	}
    }

    public static double totalVentas() {
        double montoTotal = 0;
        for (Contrato contrato : contratos) {
        	if (ContratoCompraVenta.class.isInstance(contrato)) {
        		ContratoCompraVenta contratoCyV = (ContratoCompraVenta) contrato;
        		montoTotal += contratoCyV.montoTotal();
        	}
            
        }
        return montoTotal;
    }
}