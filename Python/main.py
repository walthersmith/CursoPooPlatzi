from account import Account
from car import Car
from UberX import UberX

if __name__ == "__main__":
    print("Hello World!")
    car = Car("AMS234",Account("Andres Herreera","ASD878"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("KLJ789",Account("Andrea Ferreira","ASD223"),"Chevrolet","Spark")
    print(vars(uberX))
    print(vars(uberX.driver))

    # car = Car()
    # car.licence  = "AMS234"
    # car.driver = "Andres Herreera"
    # print(vars(car))
    # car2 = Car()
    # car2.licence  = "QWE123"
    # car2.driver = "Martha"
    # print(vars(car2))