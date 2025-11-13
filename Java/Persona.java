/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keneth;

public class Persona {
    private String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Función con parámetros
    public void saludarPersona(String saludo) {
        System.out.println(saludo + ", mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Función sin parámetros
    public void cumpleaños() {
        edad++;
        System.out.println("Feliz cumpleaños " + nombre + ", ahora tienes " + edad + " años.");
    }
}
