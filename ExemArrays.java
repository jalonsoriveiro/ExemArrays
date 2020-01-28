/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemarrays;
import meusmetodos.*;
/**
 *
 * @author jalonsoriveiro
 */
public class ExemArrays {

    public static void main(String[] args) {

    
        Metodos obj = new Metodos();
        obj.crearArray();
        obj.amosar();
        
        //creamos array
        int valores[] ={1,2,3,4,5} ;
        
        obj.visualizar(valores);
        
        int[] valores3 = new int[3];
        obj.llenarArray(valores3);
        
        obj.visualizar(valores3);
        
        
        
    }
    
    
}
