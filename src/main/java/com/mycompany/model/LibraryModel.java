/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author Leidy Torres
 */
public class LibraryModel {
    /**
     * Declaracion de variables
     */
    private String book;
    private String autor;
    private String resultA;
    private String resultB;
    /**
     * Constructor vacio
     */
    public LibraryModel() {
    }
    /**
     * 
     * @return 
     */
    public String getBook() {
        return book;
    }
    /**
     * 
     * @param book 
     */
    public void setBook(String book) {
        this.book = book;
    }
    /**
     * 
     * @return 
     */
    public String getAutor() {
        return autor;
    }
    /**
     * 
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * 
     * @return 
     */
    public String getResultA() {
        return resultA;
    }
    /**
     * 
     * @param resultA 
     */
    public void setResultA(String resultA) {
        this.resultA = resultA;
    }
    /**
     * 
     * @return 
     */
    public String getResultB() {
        return resultB;
    }
    /**
     * 
     * @param resultB 
     */
    public void setResultB(String resultB) {
        this.resultB = resultB;
    }
    /**
     * 
     * @return 
     * */

    public String response(){
        this.resultA = this.autor;
        this.resultB = this.book;
        return this.resultA + this.resultB;
    }
    
}
