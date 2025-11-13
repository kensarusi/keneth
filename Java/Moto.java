/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keneth;

public class Moto extends Vehiculo {
    private boolean papeles;

    public Moto(String marca, int velocidadMaxima, boolean papeles) {
        super(marca, velocidadMaxima);
        this.papeles = papeles;
    }

    // Implementación de arrancar (polimorfismo)
    @Override
    public void arrancar() {
        System.out.println("La moto ha arrancado.");
    }

    // Función con parámetros
    public void hacerManiobra(String maniobra) {
        System.out.println("La moto está haciendo una maniobra: " + maniobra + ".");
    }

    // Función sin parámetros
    public void hacerRuido() {
        System.out.println("¡Vroom! La moto está haciendo ruido.");
    }
}
