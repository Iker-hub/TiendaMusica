package tiendamusica;

/**
 * Esta clase es la principal del programa, en ella se instancian los objetos y se ejecutan los métodos
 * @author: Iker García Gutiérrez
 * @version: 1.0 
 */

public class TestTiendaMusica {
/**
 * Método princpipal del programa, aquí se instancian los objetos y se ejecutan los métodos
 */
    public static void main(String[] args) {
        //Instanciación de dos objetos de tipo Instrumentos
        Instrumentos guitarra = new Instrumentos("Guitarra", "Ibanez", "JEM 555", 1144.00);
        Instrumentos bajo = new Instrumentos("Bajo", "Warwick", "Corvette", 924.00);
        //Instanciación de dos objetos de tipo Clientes
        Clientes cliente1 = new Clientes("Pepe Sánchez", 20, 623145382);
        Clientes cliente2 = new Clientes("Ana Castillo", 16, 623114285);
        //Instanciación de un objeto de tipo TiendaMusica
        TiendaMusica tienda = new TiendaMusica();
        //Se añaden los objetos de tipo Instrumentos al ArrayList listaInstrumentos
        tienda.añadirInstrumentos(guitarra);
        tienda.añadirInstrumentos(bajo);
        //Se añaden los objetos de tipo Clientes al ArrayList listaClientes
        tienda.añadirClientes(cliente1);
        tienda.añadirClientes(cliente2);
        //Un cliente compra un instrumento y lo compra
        cliente1.comprar(bajo);
        bajo.tocar();
        //Un cliente compra un instrumento y lo compra
        cliente2.comprar(guitarra);
        guitarra.tocar();
    }//Cierre del método
}//Cierre de la clase
