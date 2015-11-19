/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chris.appcuentas;

/**
 *
 * @author furbox
 */
public class Cuentas {

    private int id_cuenta;
    private String nombre_cuenta;
    private String desc_cuenta;

    public Cuentas(int id_cuenta, String nombre_cuenta, String desc_cuenta) {
        this.id_cuenta = id_cuenta;
        this.nombre_cuenta = nombre_cuenta;
        this.desc_cuenta = desc_cuenta;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public String getDesc_cuenta() {
        return desc_cuenta;
    }

    public void setDesc_cuenta(String desc_cuenta) {
        this.desc_cuenta = desc_cuenta;
    }

}
