/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 * Clase main del programa
 * @author Juan Camilo Vargas
 */
public class Main {

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Controlador cont = new Controlador(view,mod);
        cont.crear();
        view.setVisible(true);
    }
    
}
