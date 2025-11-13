/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.keneth;

public class Keneth {

    public static void main(String[] args) {
        // Creación de objetos
        Carro micarro = new Carro("Toyota", 180, "Rojo");
        Moto mimoto = new Moto("Yamaha", 150, true);
        Persona mipersona = new Persona("Keneth", 30);
        Bicicleta mibicicleta = new Bicicleta("Cannondale", "GW");

        // Ejemplos de uso
        micarro.mostrarInformacion();
        micarro.arrancar();
        micarro.acelerar(120);
        micarro.cambiarColor("Azul");

        mimoto.mostrarInformacion();
        mimoto.arrancar();
        mimoto.hacerManiobra("Salto");
        mimoto.hacerRuido();

        mipersona.saludarPersona("Hola");
        mipersona.cumpleaños();

        mibicicleta.pedalear(30);
        mibicicleta.frenar();
    }

}
