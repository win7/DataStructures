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
public class EstructurasDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CLista lista = new CLista();
        lista.Agregar("Juan0");
        lista.Agregar("Juan1");
        lista.Agregar("Juan2");       
        lista.Agregar("Juan3");
        lista.Agregar("Juan4");
        lista.Agregar("Juan5");
        lista.Mostrar();
        
        // System.out.println(lista.EliminarPosicion(6));
        // lista.Mostrar();
        
        // System.out.println(lista.BuscarElemento("Juan2"));
        System.out.println(lista.BuscarPosicion(10));

    }
}
