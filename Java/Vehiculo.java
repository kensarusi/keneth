/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keneth;

public abstract class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos abstractos
    public abstract void arrancar();

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }

    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }

    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }

    public String estado() {
        return "El vehículo está en buen estado.";
    }
}
