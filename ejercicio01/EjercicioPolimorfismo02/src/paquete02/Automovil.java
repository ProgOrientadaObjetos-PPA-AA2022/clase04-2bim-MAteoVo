/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String n, String p) {
        nombrePropietario = n;
        placa = p;
    }

    public void calcularValorCancelar() {
    }

    public double getValorCancelar() {
        return valorCancelar;
    }

    public void setNombrePropietario(String n) {
        nombrePropietario = n;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setPlaca(String p) {
        placa = p;
    }

    public String getPlaca() {
        return placa;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre propietario: %s\nPlaca: %s\n",nombrePropietario,placa);
        return cadena;
    }
}
