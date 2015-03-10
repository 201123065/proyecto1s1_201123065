
package proyecto1edd.Informacion;


public class ControlDeAeropuerto {
    public Nodo Inicio;
    public Nodo fin;
    public ControlDeAeropuerto(){
        Inicio = null;
        fin=null;
    }
    public void InsertarInicio(Object dato){
        if(Inicio==null){
            Inicio= new Nodo(dato,null,null);
            fin=Inicio;
        }
        else{
            Nodo nuevo = new Nodo(dato,null,Inicio);
            Inicio.setAnterior(nuevo);
            Inicio =nuevo;
        }
        
    }
    
}
