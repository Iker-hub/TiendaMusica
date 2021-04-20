package tiendamusica;

/**
 * Esta clase crea objetos de tipo Instrumentos
 * @author: Iker García Gutiérrez
 * @version: 1.0 
 */

public class Instrumentos {
    
    //Campos de la clase
    String nombre;
    String marca;
    String modelo;
    double precio;
    /**
     * Constructor para el objeto de tipo Instrumentos creado
     * @param nombre El parámetro nombre define el nombre del instrumento
     * @param marca El parámetro marca define la marca del instrumento
     * @param modelo El parámetro modelo define el modelo del instrumento
     * @param precio El parámetro precio define el precio del instrumento
     */
    public Instrumentos(String nombre, String marca, String modelo, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }//Cierre del constructor
    /**
     * Método que devuelve el nombre del objeto de tipo Instrumentos
     * @return el nombre del objeto de tipo Instrumentos
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que establece el nombre del objeto de tipo Instrumentos
     * @param nombre El parámetro nombre define el nombre que se le establece al objeto de tipo Instrumentos
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que devuelve la marca del objeto de tipo Instrumentos
     * @return la marca del objeto de tipo Instrumentos
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Método que establece la marca del objeto de tipo Instrumentos
     * @param marca El parámetro marca define la marca que se le establece al objeto de tipo Instrumentos
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método que devuelve el modelo del objeto de tipo Instrumentos
     * @return el modelo del objeto de tipo Instrumentos
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Método que establece el modelo del objeto de tipo Instrumentos
     * @param modelo El parámetro modelo define el modelo que se le establece al objeto de tipo Instrumentos
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Método que devuelve el precio del objeto de tipo Instrumentos
     * @return el precio del objeto de tipo Instrumentos
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método que establece el precio del objeto de tipo Instrumentos
     * @param precio El parámetro precio define el precio que se le establece al objeto de tipo Instrumentos
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Método que muestra por pantalla un mensaje que simboliza que el instrumento está siendo tocado
     */
    public void tocar() {
        System.out.println(getNombre() + " " + getModelo() + " suena estupendamente");
    }
    /**
     * Método que devuelve los atributos del objeto de tipo Instrumentos
     * @return los atributos del objeto de tipo Instrumentos
     */
    @Override
    public String toString() {
        return "Instrumentos{" + "nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }//Cierre del método
}//Cierre de la clase
