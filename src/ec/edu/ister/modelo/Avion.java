/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * @author hp
 */
public class Avion extends Vehiculo {
    public Avion(){
        asientos= new Cliente[4][5];
    }
    String[] etiquetas = new String[]{"A","B","C","D","E"};
    protected void listaAsientos(){
        int i,j=0;
        for (i = 0;  i< asientos.length; i++) {
            for ( j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j]==null) {
                    System.out.println("vacio");
                    
                    
                }else{
                    String asiento=(i+1)+ etiquetas[j];
                    System.out.println("Asientos: "+ asiento+" "
                    +asientos[i][j].getNombre()+" "
                    +asientos[i][j].getApellido());
                }
                
            }
            
        }
    }
}
