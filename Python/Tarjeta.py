from payment import Payment


class Tarjeta(Payment):
    idCard = str
    cvv = int
    date = str

    def __init__(self, id, idCard, cvv, date):
        super.__init__(id)
        self.idCard = idCard
        self.cvv = cvv
        self. date = date
