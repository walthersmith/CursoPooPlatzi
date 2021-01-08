from account import Account

class Car:
    """
    Car class
    """
    id          = int
    license     = str
    driver      = Account("","")
    passenger   = int

    def __init__(self,licence,driver):
        self.license = licence
        self.driver = driver