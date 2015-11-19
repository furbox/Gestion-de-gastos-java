/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chris.appcat;

/**
 *
 * @author furbox
 */
public class Categorias {

    private int id_cat;
    private String nombre_cat;
    private String desc_cat;

    public Categorias(int id_cat, String nombre_cat, String desc_cat) {
        this.id_cat = id_cat;
        this.nombre_cat = nombre_cat;
        this.desc_cat = desc_cat;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }

    public String getDesc_cat() {
        return desc_cat;
    }

    public void setDesc_cat(String desc_cat) {
        this.desc_cat = desc_cat;
    }

}
