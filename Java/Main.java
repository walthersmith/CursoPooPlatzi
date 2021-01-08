package Java;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // Noncompliant
        Car car = new Car("AMQ123",new Account("Walther", "AND1234"));
        // car.license = "AMQ123";
        // car.driver = "Walther";
        // car.passenger = 4;
        // System.out.println("Car License: " + car.license);
        // System.out.println("Car dirver: " + car.driver);
        // System.out.println("Car passenger: " + car.passenger); 
        car.printDataCar();


        Car car2 = new Car("QwE567", new Account("Andrea Herrera", "AND1452120"));
        // car2.license = "QwE567";
        // car2.driver  = "Andrea Herrera";
        // car2.passenger = 3;
        // System.out.println("Car License: " + car2.license);
        // System.out.println("Car dirver: " + car2.driver);
        // System.out.println("Car passenger: " + car2.passenger);
        car2.printDataCar();

    }
}