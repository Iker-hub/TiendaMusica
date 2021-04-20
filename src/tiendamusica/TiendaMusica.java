package tiendamusica;

import java.util.ArrayList;

/**
 * Esta clase representa una tienda de música que registra sus productos y sus clientes en ArrayList
 * @author: Iker García Gutiérrez
 * @version: 1.0 
 */

public class TiendaMusica {
    
//Campos de la clase
    ArrayList<Instrumentos> listaInstrumentos = new ArrayList();
    ArrayList<Clientes> listaClientes = new ArrayList();
    /**
     * Método que añade objetos de tipo Instrumentos al ArrayList listaInstrumentos
     * @param instrumento El parámetro instrumento define el instrumento que se guarda en el ArraayList
     */
    public void añadirInstrumentos(Instrumentos instrumento) {
        listaInstrumentos.add(instrumento);
    }
    /**
     * Método que añade objetos de tipo Clientes al ArrayList listaClientes
     * @param cliente El parámetro cliente define el cliente que se guarda en el ArraayList
     */
    public void añadirClientes(Clientes cliente) {
        listaClientes.add(cliente);
    }//Cierre del método
}//Cierre de la clase 
