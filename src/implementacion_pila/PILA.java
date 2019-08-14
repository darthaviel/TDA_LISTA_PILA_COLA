
package implementacion_pila;

import implementacion_lista.LISTA;

public class PILA implements interfaces.interfasePila
{
    LISTA lista_pila = new LISTA();
    
    // El tope de la pila se difine en FIN() de la lista lista_pila
    
    public boolean METE(Object dato) {
       
      if(lista_pila.INSERTA(dato, lista_pila.FIN())==-1)
          return false;
      return true;
    }
   
    public Object TOPE() {
        return lista_pila.RECUPERA(lista_pila.ANTERIOR(lista_pila.FIN()));
    }
    
    public boolean SACA() {
        if(lista_pila.SUPRIME(lista_pila.ANTERIOR(lista_pila.FIN()))==-1)
            return false;
        return true;
    }
    
    public boolean VACIA() {
        return lista_pila.VACIA();
    }

    public int ANULA() {
        lista_pila.ANULA();
        return -1;
    }
    
}
