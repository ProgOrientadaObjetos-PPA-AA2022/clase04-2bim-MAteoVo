/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        AutomovilGasolina ag = new AutomovilGasolina("Jelipe el Pirata", "001", 20, 3, 10);
        AutomovilDiesel ad = new AutomovilDiesel("Bob el Constructor", "002", 20, 2, 10);
        ag.calcularValorCancelar();
        ad.calcularValorCancelar();
        System.out.println(ag);
        System.out.println(ad);
    }
}
