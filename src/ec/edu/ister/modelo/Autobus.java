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
public class Autobus extends Vehiculo {
    public Autobus(){
        asientos = new Cliente[5][2];
        
    }

    /**
     *
     * @param cliente
     * @return
     */
    @Override
    public String reservaAsiento(Cliente cliente){
        int i,j=0;
        boolean encontrar = true;
        for (i = 0;  i< asientos.length; i++) {
            if (encontrar) {
                break;
                
            }
            for ( j = 0; j <asientos[i].length; j++) {
                if (asientos[i][j]==null) {
                    System.out.println("ocupado");
                }
//                    if (asientos[i][0]==null||!asientos[i][0].getGenero().equals(cliente.getGenero()));
//                    continue;    
//                    }
                    
                }
                asientos[i][j]=cliente;
                encontrar=true;
                break;
            }
            
        

             int asiento = (i-1)*asientos[0].length +j+1;
             return asiento +"";
    }

//    public void reservarAsiento(Cliente c) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    

}
