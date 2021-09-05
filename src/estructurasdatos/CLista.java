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
public class CLista {
    // Atributos
    protected CNodo primero;
    private int tamanio;
    
    // Constructores
    public CLista() {
        this.primero = null;
        this.tamanio = 0;
    }
    
    public CLista(CNodo primero, int tamanio) {
        this.primero = primero;
        this.tamanio = tamanio;
    }

    public CNodo getPrimero() {
        return primero;
    }

    public void setPrimero(CNodo primero) {
        this.primero = primero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    // Métodos
    public void Agregar(String elemento) {
        CNodo nuevo = new CNodo(elemento, null);
        CNodo actual = this.primero;
        if (actual == null) {
            this.primero = nuevo;
            this.tamanio++;
        } else {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            this.tamanio++;
        }
    }
    
    public int EliminarElemento(String elemento) {
        // Elimina por elemento y retorna la posición del elemento
        int posicion = -1;
        int contador = 0;
        
        CNodo actual = this.primero;
        if (actual == null) {
            posicion = -1;
        } else {
            if (actual.getElemento().equals(elemento)) {
                this.primero = actual.getSiguiente();
                this.tamanio--;
                posicion = 0;
            } else {
                while (actual.getSiguiente() != null) {
                    contador++;
                    if (actual.getSiguiente().getElemento().equals(elemento)) {
                        actual.setSiguiente(actual.getSiguiente().getSiguiente());
                        this.tamanio--;
                        posicion = contador;
                        break;
                    }
                    actual = actual.getSiguiente();
                }
            }
        }
        return posicion;
    }
    
    public int BuscarElemento(String elemento) {
        // Busca por elemento y retorna la posición del elemento
        int posicion = -1;
        int contador = 0;
        CNodo actual = this.primero;
        while (actual != null) {
            if (actual.getElemento().equals(elemento)) {
                posicion = contador;
                break;
            }
            actual = actual.getSiguiente();
            contador++;
        }
        return posicion;
    }
        
    public void Mostrar() {
        CNodo actual = this.primero;
        while (actual != null) {
            System.out.println(actual.getElemento());
            actual = actual.getSiguiente();
        }
        System.out.println("");
    }
    
    // Insertar un elemento en una determinada posición
    
    // Eliminar un elemento en una determinada posición
    public int EliminarPosicion(int posicion) {
        // Elimina por posición y retorna la posición del elemento
        int contador = 0;
        if (posicion < this.tamanio) {
            CNodo actual = this.primero;
            if (actual == null) {
                posicion = -1;
            } else {
                if (posicion == 0) {
                    this.primero = actual.getSiguiente();
                    this.tamanio--;
                    posicion = 0;
                } else {
                    while (actual.getSiguiente() != null) {
                        contador++;
                        if (contador == posicion) {
                            actual.setSiguiente(actual.getSiguiente().getSiguiente());
                            this.tamanio--;
                            posicion = contador;
                            break;
                        }
                        actual = actual.getSiguiente();
                    }
                }
            }
        } else {
            posicion = -1;
        }
        return posicion;
    }
    
    public String BuscarPosicion(int posicion) {
        // Busca por posicion y retorna el elemento
        int contador = 0;
        String elemento = "";
        if (posicion < this.tamanio) {
            CNodo actual = this.primero;
            while (actual != null) {
                if (contador == posicion) {
                    elemento = actual.getElemento();
                    break;
                }
                actual = actual.getSiguiente();
                contador++;
            }
        } 
        return elemento;
    }
}
