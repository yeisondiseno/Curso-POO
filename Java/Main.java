class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car( "AMQ123", new Account( "Andrés Herrera", "AND123" ));
        car.printDataCar();
    }
}