package ar.edu.unju.escmi.tp4.main;

import ar.edu.unju.escmi.tp4.collections.*;
import ar.edu.unju.escmi.tp4.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        CollectionInmobiliaria.precargarInmobiliarias();
        CollectionInmueble.precargaInmuebles();
        CollectionCliente.precargarClientes();
        
        do {
        	try {
            System.out.println("Menú de Opciones:");
            System.out.println("1 - Registrar terreno");
            System.out.println("2 - Registrar vivienda");
            System.out.println("3 - Registrar cliente");
            System.out.println("4 - Alquiler de vivienda");
            System.out.println("5 - Venta de terreno");
            System.out.println("6 - Consultar Inmuebles");
            System.out.println("7 - Consultar viviendas alquiladas");
            System.out.println("8 - Consultar terrenos vendidos");
            System.out.println("9 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
        	}catch(Exception e) {
        		opcion = 999;
        		scanner.nextLine();
        	}
            switch (opcion) {
                case 1:
                	try {
                	int idTerreno = CollectionInmueble.sumarId();
                	
                	System.out.println("A que inmobiliaria pertenecerá este terreno? ");
                	CollectionInmobiliaria.mostrarInmobiliarias();
                	Inmobiliaria inmobiliariaTerreno = CollectionInmobiliaria.buscarInmobiliaria(scanner.nextLine());
                	
                	System.out.print("Ingrese el nombre del terreno: ");
                    String nombreTerreno = scanner.next();

                    System.out.print("Ingrese el precio del terreno: ");
                    
                    double precioTerreno = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ingrese la latitud del terreno: ");
                    double latitudTerreno = scanner.nextDouble();

                    System.out.print("Ingrese la longitud del terreno: ");
                    double longitudTerreno = scanner.nextDouble();

                    System.out.print("Ingrese la superficie del terreno: ");
                    double superficieTerreno = scanner.nextDouble();
                    
                    System.out.println("Seleccione una inmobiliaria: ");
                    
                    boolean codigoDisponibilidadTerreno = true;

                    Terreno nuevoTerreno = new Terreno(idTerreno, nombreTerreno, precioTerreno,inmobiliariaTerreno, 
                                                        codigoDisponibilidadTerreno, latitudTerreno,
                                                        longitudTerreno, superficieTerreno);
                    CollectionInmueble.agregarTerreno(nuevoTerreno);
                	}catch(Exception e) {
                		opcion = 999;
                		scanner.nextLine();
                		System.out.println("Ingrese los datos correctamente.");
                	}
                    break;
                    
                case 2:
                	try {
                	int idVivienda = CollectionInmueble.sumarId();
                	System.out.println("A que inmobiliaria pertenecerá esta vivienda? (Ingrese el nombre completo de la Inmobiliaria. Ej: 'Inmobiliaria Espacio Ideal')");
                	CollectionInmobiliaria.mostrarInmobiliarias();
                	Inmobiliaria inmobiliariaVivienda = CollectionInmobiliaria.buscarInmobiliaria(scanner.nextLine());
                	System.out.print("Ingrese el nombre de la vivienda: ");
                    String nombreVivienda = scanner.nextLine();

                    System.out.print("Ingrese la dirección de la vivienda: ");
                    String direccionVivienda = scanner.nextLine();

                    System.out.print("Ingrese el precio de la vivienda: ");
                    double precioVivienda = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ingrese la cantidad de habitaciones: ");
                    int cantidadHabitaciones  = scanner.nextInt();
                    scanner.nextLine();
                    
                   boolean estadoDisponibilidadVivienda = true;

                    Vivienda nuevaVivienda = new Vivienda(idVivienda,nombreVivienda, direccionVivienda, precioVivienda,inmobiliariaVivienda, 
                                                        estadoDisponibilidadVivienda, cantidadHabitaciones);
                    CollectionInmueble.agregarVivienda(nuevaVivienda);
                	}catch(Exception e) {
                		opcion = 999;
                		scanner.nextLine();
                		System.out.println("Ingrese los datos correctamente.");
                	}
                    break;
                    
                case 3:
                	try {
                	System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();

                    System.out.print("Ingrese el apellido: ");
                    String apellidoCliente = scanner.nextLine();

                    System.out.print("Ingrese el DNI del cliente: ");
                    String dniCliente  = scanner.nextLine();

                    System.out.print("Ingrese el numero de telefono: ");
                    String telefonoCliente = scanner.nextLine();

                    System.out.print("Ingrese la direccion: ");
                    String direccionCliente  = scanner.nextLine();

                    System.out.print("Ingrese el email: ");
                    String emailCliente = scanner.nextLine();

                    Cliente nuevoCliente = new Cliente(nombreCliente,apellidoCliente,dniCliente,telefonoCliente,direccionCliente,emailCliente);
                    CollectionCliente.agregarCliente(nuevoCliente);
                	}catch(Exception e) {
                		opcion = 999;
                		scanner.nextLine();
                		System.out.println("Ingrese los datos correctamente.");
                	}
                    break;
                    
                case 4:
                    try {
                	System.out.println("Ingrese el DNI para empezar el trámite...");
                	String dniBuscado = scanner.next();
                	System.out.println("Ingrese el id de la vivienda a alquilar");
                	int idBuscado = scanner.nextInt();
                	scanner.nextLine();
                	
                	Cliente inquilino = CollectionCliente.buscarCliente(dniBuscado);
                	Inmueble viviendaAAlquilar = CollectionInmueble.buscarInmueble(idBuscado);
                	if (inquilino == null) {
                		System.out.println("El cliente no está listado");
                	}else if (viviendaAAlquilar == null) {
                		System.out.println("No existe vivienda con ese código");
                	}else {
                		System.out.println("Por cuantos años quiere el contrato? [2-4]");
                		int duracion = scanner.nextInt();
                		scanner.nextLine();
                		System.out.println("El precio sería el siguiente: " + viviendaAAlquilar.getPrecio() + " Por mes + un adicional que representa un 20% del alquiler, como gastos de la inmobiliaria");
                		double adicional = viviendaAAlquilar.getPrecio() * 0.20;
                		System.out.println("El adicional sería de: $" + adicional);
                		LocalDate fechaContrato = LocalDate.now();
                		System.out.println("Fecha en que el contrato se crea: " + fechaContrato);
                		
                		ContratoAlquiler nuevoContratoAlquiler = new ContratoAlquiler(inquilino, fechaContrato, viviendaAAlquilar.getInmobiliaria(),duracion,viviendaAAlquilar.getPrecio(),adicional,(Vivienda)viviendaAAlquilar);
                		viviendaAAlquilar.setEstadoDisponibilidad(false);
                		CollectionContrato.agregarContrato(nuevoContratoAlquiler);
                	}
                    }catch(Exception e) {
                		opcion = 999;
                		scanner.nextLine();
                		System.out.println("Ingrese los datos correctamente.");
                	}
                    break;
                case 5:
                	try {
                	System.out.println("Ingrese el DNI para empezar el trámite...");
                	String dniComprador = scanner.next();
                	System.out.println("Ingrese el id del Terreno a comprar");
                	int idTerrenoBuscado = scanner.nextInt();
                	scanner.nextLine();
                	
                	Cliente comprador = CollectionCliente.buscarCliente(dniComprador);
                	Inmueble terrenoAComprar = CollectionInmueble.buscarInmueble(idTerrenoBuscado);
                	if (comprador == null) {
                		System.out.println("El cliente no está listado");
                	}else if (terrenoAComprar == null) {
                		System.out.println("No existe vivienda con ese código");
                	}else {
                		System.out.println("El precio sería el siguiente: " + terrenoAComprar.getPrecio() + " + los impuestos a pagar");
                		Terreno terrenoNuevo = (Terreno) terrenoAComprar;
                		System.out.println("Ingrese el precio a pagar de los impuestos: ");
                		double impuestos = scanner.nextDouble();
                		scanner.nextLine();
                		LocalDate fechaContratoCompra = LocalDate.now();
                		System.out.println("Fecha en que el contrato se crea: " + fechaContratoCompra);
                		
                		ContratoCompraVenta nuevoContratoTerreno = new ContratoCompraVenta(comprador,fechaContratoCompra,terrenoNuevo.getInmobiliaria(),terrenoNuevo,impuestos);
                		terrenoAComprar.setEstadoDisponibilidad(false);
                		CollectionContrato.agregarContrato(nuevoContratoTerreno);
                		}
                	}catch(Exception e) {
                		opcion = 999;
                		scanner.nextLine();
                		System.out.println("Ingrese los datos correctamente.");
                	}
                    break;
                    
                case 6:
                	
                	boolean band = false;
                	
                	do {
                		
                    System.out.println("Ingrese el tipo de inmueble que busca:  (Vivienda - Terreno)");
                    String tipo = scanner.nextLine();
                    tipo = tipo.toLowerCase();
                    
                    if (tipo.equals("vivienda") || tipo.equals("terreno")) {
                    	try {
                    	System.out.println("Mostrando " + tipo + "s disponibles: " );
                    	CollectionInmueble.mostrarInmueblesDisponibles(tipo);
                    	band = true;
                    	}catch(Exception e) {
                    		System.out.println("Ha ocurrido un error: " + e.getMessage());
                    	}
                    }else {
                    	System.out.println("Ingrese el tipo con el formato correspondiente: 'terreno' , 'vivienda'. Intente nuevamente");
                    	band = false;
                    }
                    
                	}while(band == false);
                    
                    break;
                    
                case 7:
                	System.out.println("Mostrando contratos de Alquiler en el Sistema: ");
                    CollectionContrato.mostrarContratosAlquiler();
                    break;
                case 8:
                    System.out.println("Mostrnado terrenos vendidos por contrato en el Sistema: ");
                    CollectionContrato.mostrarContratosCompraVenta();
                    System.out.println("El total de las ventas es de: " + CollectionContrato.totalVentas());
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
        //
    }
}