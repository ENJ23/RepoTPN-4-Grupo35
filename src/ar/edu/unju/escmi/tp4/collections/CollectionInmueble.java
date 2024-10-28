package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.escmi.tp4.dominio.Inmueble;
import ar.edu.unju.escmi.tp4.dominio.Terreno;
import ar.edu.unju.escmi.tp4.dominio.Vivienda;

public class CollectionInmueble {
    public static ArrayList<Inmueble> inmuebles = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static int idIncremental = 11;
    
    
    public static void precargaInmuebles() {
    	
    	inmuebles.add(new Vivienda(1, "Casa en el campo", "Calle Rural 1", 150000, CollectionInmobiliaria.inmobiliarias.get(0), true, 3));
        inmuebles.add(new Vivienda(2, "Departamento en la ciudad", "Av. Principal 200", 120000, CollectionInmobiliaria.inmobiliarias.get(1), false, 2));
        inmuebles.add(new Vivienda(3, "Casa de playa", "Playa Bonita", 250000, CollectionInmobiliaria.inmobiliarias.get(0), true, 4));
        inmuebles.add(new Vivienda(4, "Loft moderno", "Calle Central 50", 180000, CollectionInmobiliaria.inmobiliarias.get(1), true, 1));
        inmuebles.add(new Vivienda(5, "Chalet acogedor", "Montaña Alta", 200000, CollectionInmobiliaria.inmobiliarias.get(0), false, 3));
        inmuebles.add(new Terreno(6, "Terreno en la playa", 50000,  CollectionInmobiliaria.inmobiliarias.get(0), true, -58.5678, 1000, -34.1234));
        inmuebles.add(new Terreno(7, "Terreno rural", 30000,  CollectionInmobiliaria.inmobiliarias.get(1), false, -58.1234, 2000, -34.5678));
        inmuebles.add(new Terreno(8, "Terreno en el centro", 150000,  CollectionInmobiliaria.inmobiliarias.get(0), true, -58.6543, 500, -34.9876));
        inmuebles.add(new Terreno(9, "Terreno en la montaña", 80000,  CollectionInmobiliaria.inmobiliarias.get(1), true, -58.8765, 1500, -34.4567));
        inmuebles.add(new Terreno(10, "Terreno en suburbio", 60000,  CollectionInmobiliaria.inmobiliarias.get(0), false, -58.3456, 1200, -34.2345));
    }

    public static int sumarId() {
    	return idIncremental++;
    }
    
    public static void agregarTerreno(Terreno nuevoTerreno) {
    	
        inmuebles.add(nuevoTerreno);
        System.out.println("Terreno registrado exitosamente.");

    }
    

    public static void agregarVivienda(Vivienda nuevaVivienda) {
        
        inmuebles.add(nuevaVivienda);
        System.out.println("Vivienda añadida con éxito");
    }

    
}