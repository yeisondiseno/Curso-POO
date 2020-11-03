import java.util.ArrayList;
import Java.util.Map;

class UberVan extends Car {
    Map<String, ArrayList<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;


    public UberVan( 
        String license, 
        Account driver, 
        SMap<String, ArrayList<String,Integer>> typeCarAccepted,
        ArrayList<String> seatMateria
    ) {
        super( license, driver );
        this.brand = brand;
        this.model = model;
    }
}