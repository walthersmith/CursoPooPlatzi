package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String,ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public UberBlack(String licence,Account driver,Map<String,ArrayList<String,Integer>> typeCarAccepted,ArrayList<String> seatsMaterial){
        super(licence, driver);
        this.typeCarAccepted =typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
        
        
    }
    


}