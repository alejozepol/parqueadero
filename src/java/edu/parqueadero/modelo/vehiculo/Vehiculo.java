/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.parqueadero.modelo.vehiculo;

/**
 *
 * @author alejo
 */
public abstract class Vehiculo {

    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private int tarifa;
    private int minutos;
    private double valorTotal;

    public Vehiculo(String matricula, String marca, String modelo, int tarifa, int minutos, double valorTotal) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.minutos = minutos;
        this.valorTotal = valorTotal;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
