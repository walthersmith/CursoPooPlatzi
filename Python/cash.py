from payment import Payment
class Cash(Payment):
    """
    cash class
    """

    def __init__(self, id,amount):
        super().__init__(id,amount)
    
    