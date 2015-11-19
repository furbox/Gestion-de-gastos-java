/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chris.appmov;

/**
 *
 * @author furbox
 */
public class Movimientos {
    private int tipo_mov;
    private float cantidad;
    private String descripcion;
    private int categoria;
    private int cuenta;

    public Movimientos(int tipo_mov, float cantidad, int categoria, int cuenta) {
        this.tipo_mov = tipo_mov;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.cuenta = cuenta;
    }

    public Movimientos(int tipo_mov, float cantidad, String descripcion, int categoria, int cuenta) {
        this.tipo_mov = tipo_mov;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cuenta = cuenta;
    }
    
    

    public int getTipo_mov() {
        return tipo_mov;
    }

    public void setTipo_mov(int tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
