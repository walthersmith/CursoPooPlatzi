from payment import Payment
class Card(Payment):
    """
    Card class
    """
    card_number  = int
    card_date    = str
    card_cvc     = int 

    def __init__(self,id,amount,card_number,card_date,card_cvc):
        super().__init__(id,amount)
        self.card_number = card_number
        self.card_date   = card_date
        self.card_cvc    = card_cvc