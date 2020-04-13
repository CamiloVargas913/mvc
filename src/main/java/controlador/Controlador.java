/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.Modelo;
import vista.Vista;

/**
 * Clase que controla los eventos del programa e implementa la interface ActionListener
 * @author David Marquez
 */
public class Controlador implements ActionListener {
    /**
     * Variable para guardar la vista
     */
    private final Vista view;
    /**
     * Variable para guardar el modelo
     */
    private final Modelo model;
    /**
     * Variable para determinar el tipo de lista
     */
    DefaultListModel listaNombres = new DefaultListModel();

    /**
     * Constructor main de la clase
     * @param view Contiene la vista
     * @param model Contiene el modelo
     */
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.Bagregar.addActionListener(this);
    }
    
    /**
     * Metodo para crear la vista
     */
    public void crear(){
        this.view.setTitle("Modelo MVC");
        this.view.setLocationRelativeTo(null);
    }
    
    /**
     * Metodo sobreescrito de la accion del boton al dar click
     * Y ademas agrega el nombre digitado a la lista y lo pinta
     * @param e Variable de control
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.listaNombres.clear();
        this.model.setNombre(view.Tnombre.getText());
        this.model.agregar();
        for (int i = 0; i < model.getLista().size(); i++) {
            this.listaNombres.add(i,model.getLista().get(i));
        }
        this.view.jList1.setModel(listaNombres);
    }
    
}
