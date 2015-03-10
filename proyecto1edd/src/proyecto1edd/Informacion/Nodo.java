
package proyecto1edd.Informacion;

/**
 *
 * @author VENTAS
 */
public class Nodo {
    private Nodo Siguiente;
    private Nodo Anterior;
    private Object Dato;
    
    public Nodo(Object Objeto, Nodo Sig, Nodo Prev){
        this.Siguiente=Sig;
        this.Anterior=Prev;
        this.Dato=Objeto;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo Anterior) {
        this.Anterior = Anterior;
    }

    public Object getDato() {
        return Dato;
    }

    public void setDato(Object Dato) {
        this.Dato = Dato;
    }
            
}
