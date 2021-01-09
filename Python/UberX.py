from car import Car

class UberX(Car):
    """
    UberX Class
    """
    brand = str
    model = str
    def __init__(self,license,driver,brand,model):
        super(UberX,self).__init__(license,driver)
        #super.__init__(license,driver) 
        """ si ocurre el error descriptor '__init__' requires a 'super' object but received a 'str'
        enrtonces usar super().__init__(license,driver) """
        self.brand = brand
        self.model = model
