package Java;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // Noncompliant
        UberX uberX = new UberX("AMQ123",new Account("Walther", "AND1234"),"Chevrolet","Sonic");
        //uberX.passenger = 3;
        uberX.setPassenger(3);
        uberX.printDataCar();


        // Car car2 = new Car("QwE567", new Account("Andrea Herrera", "AND1452120"));
        // car2.passenger = 3;
        // car2.printDataCar();

    }
}