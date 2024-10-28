package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.escmi.tp4.dominio.Cliente;

public class CollectionCliente {
	
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void precargarClientes() {
    	clientes.add(new Cliente("Juan", "Pérez", "12345678", "555-1234", "Av. Siempre Viva 123", "juan.perez@email.com"));
        clientes.add(new Cliente("María", "Gómez", "87654321", "555-5678", "Calle Falsa 456", "maria.gomez@email.com"));
        clientes.add(new Cliente("Carlos", "Fernández", "23456789", "555-8765", "Calle Verdadera 789", "carlos.fernandez@email.com"));
        clientes.add(new Cliente("Laura", "Martínez", "34567890", "555-1357", "Av. Libertador 101", "laura.martinez@email.com"));
        clientes.add(new Cliente("Pedro", "Sánchez", "45678901", "555-2468", "Calle del Sol 202", "pedro.sanchez@email.com"));
    }
     
    public static void agregarCliente(Cliente nuevoCliente) {
    	clientes.add(nuevoCliente);
    	System.out.println("Cliente añadido con éxito");
    }
    
    public static boolean existeCliente(Cliente cliente) {
    	return clientes.contains(cliente);
    }
    
    public static Cliente buscarCliente(String codigo) {
    	
    	for (Cliente c : clientes) {
    		if (c.getDni().equals(codigo)) {
    			return c;
    		}
    	}
    	return null;
    }
}