class UberX extends Car {
    String brand;
    String model;

    public UberX( String license, Account driver, String brand, String model ) {
        super( license, driver, passenger = 4 );
        this.brand = brand;
        this.model = model;
    }
}