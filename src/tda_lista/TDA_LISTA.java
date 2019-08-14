/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_lista;

import implementacion_lista.LISTA;
import implementacion_pila.PILA;


/**
 *
 * @author hguevara
 */
public class TDA_LISTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LISTA mi_lista = new LISTA();
        PILA mi_pila = new PILA();
        mi_lista.INSERTA("SEXTO", mi_lista.PRIMERO());
        mi_lista.INSERTA("QUINTO", mi_lista.PRIMERO());
        mi_lista.INSERTA("CUARTO", mi_lista.PRIMERO());
        mi_lista.INSERTA("TERCERO", mi_lista.PRIMERO());
        mi_lista.INSERTA("SEGUNDO", mi_lista.PRIMERO());
        mi_lista.INSERTA("PRIMERO", mi_lista.PRIMERO());
        // Listar elementos de la Lista
        System.out.println("============LISTA INICIAL==============");
        int pos = mi_lista.PRIMERO();
        while(pos != mi_lista.FIN())
        {
           System.out.println(mi_lista.RECUPERA(pos));
           pos = mi_lista.SIGUIENTE(pos);
        
        }
        
        while (!mi_lista.VACIA()) {            
            mi_pila.METE(mi_lista.RECUPERA(mi_lista.PRIMERO()));
            mi_lista.SUPRIME(mi_lista.PRIMERO());
        }
        System.out.println("");
        while (!mi_pila.VACIA()) {            
            mi_lista.INSERTA(mi_pila.TOPE(), mi_lista.FIN());
            mi_pila.SACA();
        }
        
        // Listar elementos ordenados de la lista
        System.out.println("============LISTA INVERTIDA==============");
        pos = mi_lista.PRIMERO();
        while(pos != mi_lista.FIN())
        {
           System.out.println(mi_lista.RECUPERA(pos));
           pos = mi_lista.SIGUIENTE(pos);
        
        }
    }
    
}
