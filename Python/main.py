from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS568", Account("Andrés Herrera", "1128396138"))
    print(vars(car))
    print(vars(car.driver))
