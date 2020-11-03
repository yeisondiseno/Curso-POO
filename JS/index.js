// import Car from './Car';
// import Account from './Account';

var car = new Car( 
    "AWS568", 
    new Account( "Andrés Herrera", 
    "11456987") 
);

car.passenger = 4;
car.printDataCar();

var uberx = new UberX(
    "RTD456",
    new Account( "Carlos Salazar",
    "258963969" ),
    "Chevrolet",
    "Spark"
);

uberx.passenger = 4;
uberx.printDataCar();