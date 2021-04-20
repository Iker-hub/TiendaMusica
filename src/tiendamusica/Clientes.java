package tiendamusica;

/**
 * Esta clase crea objetos de tipo Clientes
 * @author: Iker García Gutiérrez
 * @version: 1.0 
 */

public class Clientes {
    
    //Campos de la clase
    String nombre;
    int idSocio;
    double telefono;
    /**
     * Constructor para el objeto de tipo Clientes creado
     * @param nombre El parámetro nombre define el nombre del cliente
     * @param idSocio El parámetro idSocio define el identificador de socio del cliente
     * @param telefono El parámetro telefono define el telefono del cliente
     */
    public Clientes(String nombre, int idSocio, double telefono) {
        this.nombre = nombre;
        this.idSocio = idSocio;
        this.telefono = telefono;
    }//Cierre del constructor
    /**
     * Método que devuelve el nombre del objeto de tipo Clientes
     * @return el nombre del objeto de tipo Clientes
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que establece el nombre del objeto de tipo Clientes
     * @param nombre El parámetro nombre define el nombre que se le establece al objeto de tipo Clientes
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que devuelve el identificador de socio del objeto de tipo Clientes
     * @return el identificador de socio del objeto de tipo Clientes
     */
    public int getIdSocio() {
        return idSocio;
    }
    /**
     * Método que establece el identificador de socio del objeto de tipo Clientes
     * @param idSocio El parámetro idSocio define el identificador de socio que se le establece al objeto de tipo Clientes
     */
    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }
    /**
     * Método que devuelve el telefono del objeto de tipo Clientes
     * @return el telefono del objeto de tipo Clientes
     */
    public double getTelefono() {
        return telefono;
    }
    /**
     * Método que establece el telefono del objeto de tipo Clientes
     * @param telefono El parámetro telefono define el telefono que se le establece al objeto de tipo Clientes
     */
    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    /**
     * Método que muestra por pantalla el instrumento que ha sido comprado por el cliente
     * @param instrumento El parámetro instrumento define el instrumento que has comprado por el cliente
     */
    public void comprar(Instrumentos instrumento) {
        System.out.println("El socio " + getIdSocio() + " ha comprado el articulo: " + instrumento.toString());
    }//Cierre del método
}//Cierre de la clase
