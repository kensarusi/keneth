/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keneth;

public class Carro extends Vehiculo {
    private String color;

    public Carro(String marca, int velocidadMaxima, String color) {
        super(marca, velocidadMaxima);
        this.color = color;
    }

    // Implementación de arrancar (polimorfismo)
    @Override
    public void arrancar() {
        System.out.println("El carro ha arrancado.");
    }

    // Función con parámetros
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color del carro ha cambiado a " + color + ".");
    }

    // Función sin parámetros
    public void tocarBocina() {
        System.out.println("¡Bip! ¡Bip! El carro está tocando la bocina.");
    }
}
