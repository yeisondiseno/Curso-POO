const Payment = require('./Payment');

class Paypal extends Payment {
    email;

    constructor(id, email) {
        super(id);
        this.email = email;
    }
}