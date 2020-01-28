/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemarrays;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Metodos {
    int [] numeros= new int[6];
        public void crearArray(){   
            for(int i = 0; i< numeros.length;i++){
            
                //numeros[i] = meusmetodos.PedirDato.PedirInt();
                numeros[i] = PedirDato.PedirInt();
                
                
            }
    
        }      
       public void amosar(){   
            for(int i = 0; i< numeros.length;i++){
            
                System.out.println(numeros[i]);
                
            }
    
        }

//recibimos array como parametro
       public void visualizar(int[]lista){
                  for(int i = 0; i< lista.length;i++){
                      System.out.println("****"+lista[i]+"*****");
                  }
                  }
                  
       public int[] llenarArray(int[]lista){
                  for(int i = 0; i< lista.length;i++){
                      lista[i]= PedirDato.PedirInt();
                  }
                  return lista;
                  }
       
}
