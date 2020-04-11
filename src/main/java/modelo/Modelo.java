/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Juan Camilo vargas.
 */
public class Modelo {
    private String nombre;
    private List<String> Lista;
    
    public Modelo() {
        this.Lista = new ArrayList<>();
        this.nombre = "";
    }
    public List agregar(){
        this.Lista.add(this.nombre);
        return this.Lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getLista() {
        return Lista;
    }

    public void setLista(List<String> Lista) {
        this.Lista = Lista;
    }
    
}
