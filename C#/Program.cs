using System;

namespace POOEjemplo2
{
    // Clase abstracta (Abstracción)
    public abstract class Vehiculo
    {
        // Atributos con diferentes accesos
        public string marca { get; set; }
        private int velocidadMaxima;

        // Constructor
        public Vehiculo(string marca, int velocidadMaxima)
        {
            this.marca = marca;
            this.velocidadMaxima = velocidadMaxima;
        }

        // Método con parámetros
        public abstract void Arrancar();

        // Método sin parámetros
        public void MostrarInformacion()
        {
            Console.WriteLine($"Marca: {marca}, Velocidad máxima: {velocidadMaxima} km/h");
        }

        // Función sin parámetros
        public void Detener()
        {
            Console.WriteLine("El vehículo se ha detenido.");
        }

        // Función con parámetros
        public void Acelerar(int velocidad)
        {
            Console.WriteLine($"El vehículo acelera a {velocidad} km/h.");
        }

        // Función con y sin parámetros
        public string Estado()
        {
            return "El vehículo está en buen estado.";
        }
    }

    // Clase que hereda de Vehiculo (Herencia)
    public class Carro : Vehiculo
    {
        private string color; // Privado

        public Carro(string marca, int velocidadMaxima, string color) : base(marca, velocidadMaxima)
        {
            this.color = color;
        }

        // Método sobrecargado (Polimorfismo)
        public override void Arrancar()
        {
            Console.WriteLine("El carro ha arrancado.");
        }

        // Función con parámetros
        public void CambiarColor(string nuevoColor)
        {
            color = nuevoColor;
            Console.WriteLine($"El color del carro ha cambiado a {color}.");
        }

        // Función sin parámetros
        public void TocarBocina()
        {
            Console.WriteLine("¡Bip! ¡Bip! El carro está tocando la bocina.");
        }
    }

    // Clase que hereda de Vehiculo (Herencia)
    public class Moto : Vehiculo
    {
        private bool papeles; // Privado

        public Moto(string marca, int velocidadMaxima, bool papeles) : base(marca, velocidadMaxima)
        {
            this.papeles = papeles;
        }

        // Método sobrecargado (Polimorfismo)
        public override void Arrancar()
        {
            Console.WriteLine("La moto ha arrancado.");
        }

        // Función con parámetros
        public void HacerManiobra(string maniobra)
        {
            Console.WriteLine($"La moto está haciendo una maniobra: {maniobra}.");
        }

        // Función sin parámetros
        public void HacerRuido()
        {
            Console.WriteLine("¡Vroom! La moto está haciendo ruido.");
        }
    }

    // Clase concreta (No es abstracta)
    public class Persona
    {
        // Atributos privados y públicos
        private string nombre;
        public int edad;

        // Constructor
        public Persona(string nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Función con parámetros
        public void SaludarPersona(string saludo)
        {
            Console.WriteLine($"{saludo}, mi nombre es {nombre} y tengo {edad} años.");
        }

        // Función sin parámetros
        public void Cumpleaños()
        {
            edad++;
            Console.WriteLine($"Feliz cumpleaños {nombre}, ahora tienes {edad} años.");
        }
    }

    // Clase con métodos y funciones adicionales
    public class Bicicleta
    {
        // Atributos
        private string marca;
        public string modelo;

        // Constructor
        public Bicicleta(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }

        // Función con parámetros
        public void Pedalear(int tiempo)
        {
            Console.WriteLine($"La bicicleta {marca} {modelo} ha sido pedaleada durante {tiempo} minutos.");
        }

        // Función sin parámetros
        public void Frenar()
        {
            Console.WriteLine($"La bicicleta {marca} {modelo} ha frenado.");
        }
    }

    // Clase principal
    class Program
    {
        static void Main(string[] args)
        {
            // Creación de objetos
            Carro micarro = new Carro("Toyota", 180, "Rojo");
            Moto miMoto = new Moto("Yamaha", 150, true);
            Persona miPersona = new Persona("Keneth", 30);
            Bicicleta miBicicleta = new Bicicleta("Cannondale", "GW");

            // Ejemplos de uso
            micarro.MostrarInformacion();
            micarro.Arrancar();
            micarro.Acelerar(120);
            micarro.CambiarColor("Azul");

            miMoto.MostrarInformacion();
            miMoto.Arrancar();
            miMoto.HacerManiobra("Salto");
            miMoto.HacerRuido();

            miPersona.SaludarPersona("Hola");
            miPersona.Cumpleaños();

            miBicicleta.Pedalear(30);
            miBicicleta.Frenar();
        }
    }
}
