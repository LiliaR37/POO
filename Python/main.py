from car import Car 




if __name__ == "__main__":
    print("Hola Mundo")

    car = Car()
    car.license = "AM234"
    car.driver = "Andres Herrera"

    print(vars(car))
    
    car2 = Car()
    car2.license = "ARJ450"
    car2.driver = "Andrea Rodriguez"
    print(vars(car2))
        