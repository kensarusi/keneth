// Clase abstracta (Abstracción)
class Vehiculo {
    constructor(marca, velocidadMaxima) {
        if (this.constructor === Vehiculo) {
            throw new Error("No se puede instanciar la clase abstracta Vehiculo");
        }
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos abstractos
    arrancar() {
        throw new Error("Método 'arrancar' no implementado");
    }

    mostrarInformacion() {
        console.log(`Marca: ${this.marca}, Velocidad máxima: ${this.velocidadMaxima} km/h`);
    }

    detener() {
        console.log("El vehículo se ha detenido.");
    }

    acelerar(velocidad) {
        console.log(`El vehículo acelera a ${velocidad} km/h.`);
    }

    estado() {
        return "El vehículo está en buen estado.";
    }
}

// Carro (Herencia)
class Carro extends Vehiculo {
    constructor(marca, velocidadMaxima, color) {
        super(marca, velocidadMaxima);
        this.color = color;
    }

    // Método sobrecargado (Polimorfismo)
    arrancar() {
        console.log("El carro ha arrancado.");
    }

    // Función con parámetros
    cambiarColor(nuevoColor) {
        this.color = nuevoColor;
        console.log(`El color del carro ha cambiado a ${this.color}.`);
    }

    // Función sin parámetros
    tocarBocina() {
        console.log("¡Bip! ¡Bip! El carro está tocando la bocina.");
    }
}

// Moto (Herencia)
class Moto extends Vehiculo {
    constructor(marca, velocidadMaxima, papeles) {
        super(marca, velocidadMaxima);
        this.papeles = papeles;
    }

    // Método sobrecargado (Polimorfismo)
    arrancar() {
        console.log("La moto ha arrancado.");
    }

    // Función con parámetros
    hacerManiobra(maniobra) {
        console.log(`La moto está haciendo una maniobra: ${maniobra}.`);
    }

    // Función sin parámetros
    hacerRuido() {
        console.log("¡Vroom! La moto está haciendo ruido.");
    }
}

// Persona
class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Función con parámetros
    saludarPersona(saludo) {
        console.log(`${saludo}, mi nombre es ${this.nombre} y tengo ${this.edad} años.`);
    }

    // Función sin parámetros
    cumpleaños() {
        this.edad++;
        console.log(`Feliz cumpleaños ${this.nombre}, ahora tienes ${this.edad} años.`);
    }
}

// Bicicleta
class Bicicleta {
    constructor(marca, modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Función con parámetros
    pedalear(tiempo) {
        console.log(`La bicicleta ${this.marca} ${this.modelo} ha sido pedaleada durante ${tiempo} minutos.`);
    }

    // Función sin parámetros
    frenar() {
        console.log(`La bicicleta ${this.marca} ${this.modelo} ha frenado.`);
    }
}

// Función principal
function main() {
    // Creación de objetos
    const micarro = new Carro("Toyota", 180, "Rojo");
    const mimoto = new Moto("Yamaha", 150, true);
    const mipersona = new Persona("Keneth", 30);
    const mibicicleta = new Bicicleta("Cannondale", "GW");

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

// Ejecutar la función principal
main();
