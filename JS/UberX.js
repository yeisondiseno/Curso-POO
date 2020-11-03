class UberX extends Car {
    brand;
    model;

    constructor( license, driver, brand, model ) {
        super( license, driver );
        this.brand = brand;
        this.model = model;
    }
}