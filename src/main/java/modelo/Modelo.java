/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;



/**
 * Clase para tener el control del modelo del programa
 * @author Juan Camilo vargas.
 */
public class Modelo {
    /**
     * Variable que almacena el nombre digitado
     */
    private String nombre;
    /**
     * Lista que contiene los nombres digitados
     */
    private List<String> Lista;
    
    /**
     * Constructor principal de la clase
     */
    public Modelo() {
        this.Lista = new ArrayList<>();
        this.nombre = "";
    }
    
    /**
     * Metodo para agregar el nombre a la lista
     * @return List
     */
    public List agregar(){
        this.Lista.add(this.nombre);
        return this.Lista;
    }

    /**
     * Metodo para acceder al nombre escrito
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre 
     * @param nombre Contiene el nombre escrito
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la lista de nombres
     * @return List
     */
    public List<String> getLista() {
        return Lista;
    }

    /**
     * Metodo para establecer los valor de la lista
     * @param Lista Contiene los nombres agregados
     */
    public void setLista(List<String> Lista) {
        this.Lista = Lista;
    }
    
}
