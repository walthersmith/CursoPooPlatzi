class Payment:
    """
    Payment class
    """
    id = int 
    amount = float
    
    def __init__(self,id,amount):
        self.id = id 
        self.amount = amount