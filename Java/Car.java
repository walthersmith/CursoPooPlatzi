package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String licence,Account driver){
        this.license = licence;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Liecence: " + license + " Name Diver: " + driver.name);
    }

}
