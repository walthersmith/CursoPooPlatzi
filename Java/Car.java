package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String licence,Account driver){
        this.license = licence;
        this.driver = driver; 
    }

    void printDataCar(){
        if (passenger != null){
            System.out.println("Liecence: " + license + " Name Diver: " + driver.name + " Passengers: " + passenger);
        }
    }
 
    public Integer getPassenger(){
        return passenger;
    }
    
    public void setPassenger (Integer passenger){
        if (passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }

    }
}
