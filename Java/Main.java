class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX ubertoX = new Car( 
            "AMQ123", 
            new Account( 
                "Andrés Herrera", 
                "AND123" 
            ),
            "Chevrolet",
            "Sonic"
        );
        // ubertoX.passenger = 4;
        ubertoX.setPassenger(4);
        ubertoX.printDataCar();
    }
}