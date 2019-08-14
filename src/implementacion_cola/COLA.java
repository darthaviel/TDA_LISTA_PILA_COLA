package implementacion_cola;

import implementacion_lista.LISTA;

/**
 *
 * @author l
 */
public class COLA implements interfaces.InterfaseCola {

    LISTA lista_cola = new LISTA();

    @Override
    public Object FRENTE() {
        return lista_cola.RECUPERA(lista_cola.PRIMERO());
    }

    @Override
    public boolean PONE_EN_COLA(Object dato) {
        if (lista_cola.INSERTA(dato, lista_cola.FIN()) == -1) {
            return false;
        }

        return true;

    }

    @Override
    public boolean SACA_DE_COLA() {
        if(lista_cola.SUPRIME(lista_cola.PRIMERO())==-1)
            return false;
        return true;
    }

    @Override
    public boolean VACIA() {
        return lista_cola.VACIA();
    }

    @Override
    public void ANULA() {
        lista_cola.ANULA();
    }

}
