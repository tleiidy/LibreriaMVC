/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.LibraryModel;
import com.mycompany.view.LibraryView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leidy Torres
 */
public class LibraryController implements ActionListener{
    /**
     * Declaracion de propiedades a usar
     */
    private LibraryView view;
    private LibraryModel model;
    DefaultTableModel table;
    
    
    /**
     * Constructor de la clase
     * @param view
     * @param model 
     */
    public LibraryController(LibraryView view, LibraryModel model) { 
        this.view=view;
        this.model=model;
        this.view.jButton1.addActionListener(this);
        
        table = new DefaultTableModel();
        view.jTable1.setModel(table);
        
        table.addColumn("Datos Libreria");
    }
    /**
     * Metodo que inicia la aplicacion
     */
    public void start (){
        view.setTitle("Libreria MVC");
        view.setLocationRelativeTo(null);
    }
    /**
     * 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setAutor(view.jTextField1.getText());
        model.setBook(view.jTextField2.getText());
        model.response();
        Object []object = new Object[1];
        object[0] = view.jTextField1.getText() + " " + view.jTextField2.getText();
        table.addRow(object); 
        clean();
    }
    
    /**
     * Metodo para limpiar cajas de texto
     */
     /**
     * Metodo que vacia la caja de texto
     */
    private void clean(){
        view.jTextField1.setText("");
        view.jTextField2.setText("");
    }
    
}
