/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keneth;

// Bicicleta.java
public class Bicicleta {
    private String marca;
    public String modelo;

    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Función con parámetros
    public void pedalear(int tiempo) {
        System.out.println("La bicicleta " + marca + " " + modelo + " ha sido pedaleada durante " + tiempo + " minutos.");
    }

    // Función sin parámetros
    public void frenar() {
        System.out.println("La bicicleta " + marca + " " + modelo + " ha frenado.");
    }
}
