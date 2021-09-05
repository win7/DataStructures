/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatos;

/**
 *
 * @author win7
 */
public class CNodo {
    // Atributos
    private String elemento;
    private CNodo siguiente;
    
    // Constructores
    public CNodo() {
        this.elemento = "";
        this.siguiente = null;
    }
    
    public CNodo(String elemento, CNodo siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    // Métodos
    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public CNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CNodo siguiente) {
        this.siguiente = siguiente;
    }
}
