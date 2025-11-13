package main

import "fmt"

// Clase abstracta (Abstracción)
type Vehiculo interface {
	Arrancar()
	MostrarInformacion()
	Detener()
	Acelerar(velocidad int)
	Estado() string
}

// Estructura Vehiculo con atributos
type VehiculoStruct struct {
	Marca          string
	VelocidadMaxima int
}

// Métodos para Vehiculo (cumplen la interfaz)
func (v VehiculoStruct) MostrarInformacion() {
	fmt.Printf("Marca: %s, Velocidad máxima: %d km/h\n", v.Marca, v.VelocidadMaxima)
}

func (v VehiculoStruct) Detener() {
	fmt.Println("El vehículo se ha detenido.")
}

func (v VehiculoStruct) Acelerar(velocidad int) {
	fmt.Printf("El vehículo acelera a %d km/h.\n", velocidad)
}

func (v VehiculoStruct) Estado() string {
	return "El vehículo está en buen estado."
}

// Carro (Herencia)
type Carro struct {
	VehiculoStruct
	Color string
}

// Método de Carro (Polimorfismo)
func (c Carro) Arrancar() {
	fmt.Println("El carro ha arrancado.")
}

// Función con parámetros
func (c *Carro) CambiarColor(nuevoColor string) {
	c.Color = nuevoColor
	fmt.Printf("El color del carro ha cambiado a %s.\n", c.Color)
}

// Función sin parámetros
func (c Carro) TocarBocina() {
	fmt.Println("¡Bip! ¡Bip! El carro está tocando la bocina.")
}

// Moto (Herencia)
type Moto struct {
	VehiculoStruct
	Papeles bool
}

// Método de Moto (Polimorfismo)
func (m Moto) Arrancar() {
	fmt.Println("La moto ha arrancado.")
}

// Función con parámetros
func (m Moto) HacerManiobra(maniobra string) {
	fmt.Printf("La moto está haciendo una maniobra: %s.\n", maniobra)
}

// Función sin parámetros
func (m Moto) HacerRuido() {
	fmt.Println("¡Vroom! La moto está haciendo ruido.")
}

// Persona
type Persona struct {
	Nombre string
	Edad   int
}

// Función con parámetros
func (p Persona) SaludarPersona(saludo string) {
	fmt.Printf("%s, mi nombre es %s y tengo %d años.\n", saludo, p.Nombre, p.Edad)
}

// Función sin parámetros
func (p *Persona) Cumpleaños() {
	p.Edad++
	fmt.Printf("Feliz cumpleaños %s, ahora tienes %d años.\n", p.Nombre, p.Edad)
}

// Bicicleta
type Bicicleta struct {
	Marca  string
	Modelo string
}

// Función con parámetros
func (b Bicicleta) Pedalear(tiempo int) {
	fmt.Printf("La bicicleta %s %s ha sido pedaleada durante %d minutos.\n", b.Marca, b.Modelo, tiempo)
}

// Función sin parámetros
func (b Bicicleta) Frenar() {
	fmt.Printf("La bicicleta %s %s ha frenado.\n", b.Marca, b.Modelo)
}

// Función principal
func main() {
	// Creación de objetos
	micarro := Carro{
		VehiculoStruct: VehiculoStruct{Marca: "Toyota", VelocidadMaxima: 180},
		Color:          "Rojo",
	}

	mimoto := Moto{
		VehiculoStruct: VehiculoStruct{Marca: "Yamaha", VelocidadMaxima: 150},
		Papeles:        true,
	}

	mipersona := Persona{
		Nombre: "Keneth",
		Edad:   30,
	}

	mibicicleta := Bicicleta{
		Marca:  "Cannondale",
		Modelo: "GW",
	}

	// Ejemplos de uso
	micarro.MostrarInformacion()
	micarro.Arrancar()
	micarro.Acelerar(120)
	micarro.CambiarColor("Azul")

	mimoto.MostrarInformacion()
	mimoto.Arrancar()
	mimoto.HacerManiobra("Salto")
	mimoto.HacerRuido()

	mipersona.SaludarPersona("Hola")
	mipersona.Cumpleaños()

	mibicicleta.Pedalear(30)
	mibicicleta.Frenar()
}