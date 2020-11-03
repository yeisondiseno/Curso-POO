class Car {
    id;
    license;
    driver;
    passenger;

    constructor ( license, driver ) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar = () => {
        console.log(this.driver);
        // debugger
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log(this.license);
    }
}

