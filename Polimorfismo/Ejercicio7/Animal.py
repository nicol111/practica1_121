class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacerSonido(self):
        print("Sonido genérico de animal")

    def moverse(self):
        print("Movimiento genérico de animal")

class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("¡Guau!")

    def moverse(self):
        print("Corre")

class Gato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("¡Miau!")

    def moverse(self):
        print("Camina y salta")

class Pajaro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacerSonido(self):
        print("¡Pío pío!")

    def moverse(self):
        print("Vuela")


mi_perro = Perro("Buddy")
mi_gato = Gato("Whiskers")
mi_pajaro = Pajaro("Tweety")


print("Sonidos de los animales:")
mi_perro.hacerSonido()
mi_gato.hacerSonido()
mi_pajaro.hacerSonido()

print("\nMovimientos de los animales:")
mi_perro.moverse()
mi_gato.moverse()
mi_pajaro.moverse()