/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1edd.Informacion;


public class InfoAeropuerto {
    
    Object valor;
    InfoAeropuerto Siguiente;
    InfoAeropuerto Anterior;
    InfoAeropuerto Puntero;
    public InfoAeropuerto(Object valor)
    {
        this.valor=valor;
    }
    public void Siguiente(InfoAeropuerto Val)
    {
        Siguiente = Val;
    }
    public InfoAeropuerto ObtenerSiguiente(){
        return Siguiente;
    }
    
}
