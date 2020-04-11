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
 *
 * @author PROFESIONAL
 */
public class Controlador implements ActionListener {
    
    private final Vista view;
    private final Modelo model;
    DefaultListModel listaNombres = new DefaultListModel();

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.Bagregar.addActionListener(this);
    }
    
    public void crear(){
        this.view.setTitle("Modelo MVC");
        this.view.setLocationRelativeTo(null);
    }
    
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
