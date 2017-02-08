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
public class Moto extends Vehiculo {

    public Moto(String matricula, String marca, String modelo, int tarifa, int minutos, double valorTotal) {
        super(matricula, marca, modelo,tarifa, minutos, valorTotal);
    }
}
