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
public class Vehiculo {
    protected String fabricante;
    public String placa;
    
    protected Cliente asientos [][] =new Cliente[0][0];
    
    public  void listAsientos(){
        
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j]==null) {
                    System.out.println("asiento lleno");
                                       
                }
                else{
                    int asiento = (i) * asientos[0].length+ j + 1;
                    System.out.println("asiento: "+asiento+"  "+
                            asientos[i][j].getNombre()+ "  "+
                            asientos[i][j].getApellido());
                
                }                
            }                        
        }
    }
        public String reservaAsiento(Cliente cliente){
           
            
            int i,j=0;
             boolean encontrar = false;
            for ( i = 0; i < asientos.length; i++) {
                if (encontrar) {
                    break;
                    
                }
                for ( j = 0; j < asientos[i].length; j++) {
                    if (asientos[i][j]==null) {
                        asientos[i][j]=cliente;
                        encontrar=true;
                        break;
                        
                    }
                    
                }
                
                
            }
            int asiento = (i-1)*asientos[0].length+ j + 1;
            return asiento +" "; 
            
        
        }
    
    }
    
//    public String reservarAsiento (){
//        return "ASIENTO RESERVADO";
//    }
//
//    public String getFabricante() {
//        return fabricante;
//    }
//
//    public void setFabricante(String fabricante) {
//        this.fabricante = fabricante;
//    }
    
   
    
    

