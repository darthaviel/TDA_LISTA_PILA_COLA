/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import implementacion_lista.Cursor;

/**
 *
 * @author hguevara
 */
public interface InterfaseLista {
    
    Cursor cursor_lista = new Cursor();
    
    public int PRIMERO();
    public int FIN();
    public int INSERTA(Object dato,int pos);
    public int SUPRIME(int pos);
    public Object RECUPERA(int pos);
    public int LOCALIZA(Object dato);
    public int ANTERIOR(int pos);
    public int SIGUIENTE(int pos);
    public void ANULA();
    public boolean VACIA();
    
}
