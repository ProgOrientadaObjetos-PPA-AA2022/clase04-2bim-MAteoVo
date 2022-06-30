/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double numeroGalonesMaximo;
    private double costoGalon;
    private double descuentoLitros;

    public AutomovilDiesel(String n, String p, double nGM, double cG, double d) {
        super(n, p);
        numeroGalonesMaximo = nGM;
        costoGalon = cG;
        descuentoLitros = d/100;
    }

    public void setNumeroGalonesMaximos(double n) {
        numeroGalonesMaximo = n;
    }

    public double getNumeroGalonesMaximos() {
        return numeroGalonesMaximo;
    }

    public void setCostoGalon(double c) {
        costoGalon = c;
    }

    public double getCostoGalon() {
        return costoGalon;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (numeroGalonesMaximo - (descuentoLitros * numeroGalonesMaximo)) * costoGalon;
    }

    @Override
    public double getValorCancelar() {
        return valorCancelar;
    }

    public String toString() {
        String cadena = String.format("%sNumero de galones maximo: %.2f\nCosto Galon: %.2f\nValor cancelar: %.2f",
                super.toString(), numeroGalonesMaximo, costoGalon, valorCancelar);
        return cadena;
    }
}
