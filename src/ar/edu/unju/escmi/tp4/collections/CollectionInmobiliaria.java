package ar.edu.unju.escmi.tp4.collections;

import java.util.ArrayList;

import ar.edu.unju.escmi.tp4.dominio.Inmobiliaria;

public class CollectionInmobiliaria {
    public static ArrayList<Inmobiliaria> inmobiliarias = new ArrayList<>();

    public static void precargarInmobiliarias() {
        inmobiliarias.add(new Inmobiliaria("Inmobiliaria Casa Bonita", "123456789", "Av. Siempre Viva 123"));
        inmobiliarias.add(new Inmobiliaria("Inmobiliaria Hogar Dulce Hogar", "987654321", "Calle Falsa 456"));
        inmobiliarias.add(new Inmobiliaria("Inmobiliaria Espacio Ideal", "555666777", "Paseo de la Reforma 789"));
        inmobiliarias.add(new Inmobiliaria("Inmobiliaria Tu Nuevo Hogar", "444333222", "Av. Libertador 101"));
        inmobiliarias.add(new Inmobiliaria("Inmobiliaria Sueños Realizados", "111222333", "Calle del Sol 202"));
    }
    

    public static void mostrarInmobiliarias() {
    	for (Inmobiliaria inmobiliaria : inmobiliarias) {
            inmobiliaria.mostrarDatos();
        }
    }
    
}
