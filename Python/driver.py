from account.py import Account 
class Driver(Account):
    """
    Driver Class
    """
    def __init__(self,id,name,document,email,password):
        super().__init__(id,name,document,email,password)