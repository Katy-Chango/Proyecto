/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.Autobus;
import ec.edu.ister.modelo.Avion;
import ec.edu.ister.modelo.Carro;
import ec.edu.ister.modelo.Cliente;
import ec.edu.ister.modelo.Vehiculo;

/**
 *
 * @author hp
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Cliente c= new Cliente("1","Katy","Chango","F",true);
        Cliente c2= new Cliente("2","Valeria","Chango","F",true);
        Cliente c3= new Cliente("3","Sebastian","Sandoval","M",true);
        Cliente c4= new Cliente("4","Elena","Sosa","F",true);
        Cliente c5= new Cliente("5","Patricia","Tenemaza","F",true);
        System.out.println("");
        System.out.println("**************************");
        System.out.println("asientos de carros");
        
        Carro carro = new Carro();
        carro.reservaAsiento(c);
        carro.reservaAsiento(c2);
        carro.reservaAsiento(c3);
        carro.reservaAsiento(c4);
        carro.reservaAsiento(c5);
        carro.listAsientos();
        System.out.println("  ");
        System.out.println("***********************");
        System.out.println("asientos de autobus ");
        Autobus autobus = new Autobus();
        autobus.reservaAsiento(c);
        autobus.reservaAsiento(c2);
        autobus.reservaAsiento(c3);
        autobus.reservaAsiento(c4);
        autobus.reservaAsiento(c5);
        autobus.listAsientos();

        System.out.println("  ");
        System.out.println("***********************");
        System.out.println("asinetos de aviones");
        Avion avion= new Avion();
        avion.reservaAsiento(c);
        avion.reservaAsiento(c2);
        avion.reservaAsiento(c3);
        avion.reservaAsiento(c4);
        avion.reservaAsiento(c5);
        System.out.println(" ");
        System.out.println("lista de asientos");
        avion.listAsientos();
        
    }
    

}
