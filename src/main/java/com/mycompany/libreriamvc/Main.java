/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.libreriamvc;

import com.mycompany.controller.LibraryController;
import com.mycompany.model.LibraryModel;
import com.mycompany.view.LibraryView;

/**
 *
 * @author Leidy Torres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibraryModel model = new LibraryModel();
        LibraryView view = new LibraryView();
        
        LibraryController controller =new LibraryController(view, model); 
        controller.start();
        view.setVisible(true);
    }
    
}
