/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_lista;

import implementacion_pila.PILA;
import implementacion_lista.LISTA;

/**
 *
 * @author l
 */
public class Pruebas_Unitarias {

    public static void main(String[] args) {
        LISTA l = new LISTA();
        PILA p = new PILA();
        l.INSERTA("primero", 1);
        l.INSERTA("segundo", 2);
        l.INSERTA("tercero", 3);
        l.INSERTA("quinto", 4);
        l.INSERTA("sexto", 5);
        l.INSERTA("cuarto", 4);
        l.INSERTA("septimo", 7);
        
        for (int i = 1; i < l.FIN(); i++) {
            System.out.println(l.RECUPERA(i));
        }
        
        
    }
}
