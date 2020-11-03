from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AMS568"
    car.driver = "Andrés Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "HYT789"
    car2.driver = "Andrea Jimenez"
    print(vars(car2))