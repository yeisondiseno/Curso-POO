const Payment = require('./Payment');

class Tarjeta extends Payment {
    idCard;
    cvv;
    date;

    constructor(id, idCard, cvv, date) {
        super(id);
        this.idCard = idCard;
        this.cvv =cvv;
        this.date = date;
    }
}