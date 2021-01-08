from car import Car
if __name__ == "__main__":
    print("Hello World!")
    car = Car()
    car.licence  = "AMS234"
    car.driver = "Andres Herreera"
    print(vars(car))
    car2 = Car()
    car2.licence  = "QWE123"
    car2.driver = "Martha"
    print(vars(car2))