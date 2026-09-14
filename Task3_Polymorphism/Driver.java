import java.util.ArrayList;
import java.util.List;

class Driver {
    public static void main(String[] args) {
        Ship[] arr = new Ship[3];

        arr[0] = new CargoShip("Cargo", "2010", 5000);
        arr[1] = new CruiseShip("Cruise", "2015", 3000);
        arr[2] = new Ship("Ship", "2000");

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
            System.out.println();
        }
    }
}