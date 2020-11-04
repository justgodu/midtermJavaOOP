import java.util.ArrayList;
import java.util.List;
import Exceptions.VehichleException;
public class Runner {

    public static void main(String[] args) {
        Bus bus1 = new Bus(1,600,60,80,2);
        Bus bus2 = new Bus(2,650,51,80,5);
        Bus bus3 = new Bus(2,500,80,80,1);
        Train train1 = new Train(4,1000,90,10);
        Train train2 = new Train(5,1200,120,20);
        Train train3 = new Train(6,2000,60,36);

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(bus1);
        vehicles.add(bus2);
        vehicles.add(bus3);
        vehicles.add(train1);
        vehicles.add(train2);
        vehicles.add(train3);

        try{
            validateVehicles(vehicles);
        }catch (VehichleException e){
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შემთხვევა: " + e.getMessage());
        }

        for (Vehicle vehicle : vehicles)
        {
            System.out.println("-----------------------");
            System.out.println("კოდი: " + vehicle.getCode());
            System.out.println("საშუალო სისწრაფე: " + vehicle.vehicleTime());
        }
    }

    private static void validateVehicles(List<Vehicle> vehicles) throws VehichleException{
        for (int i = 0; i< vehicles.size(); i++)
        {
            for (int j = i  +1; i< vehicles.size(); i++)
            {
                if (vehicles.get(i).getCode() == vehicles.get(j).getCode()) {

                    throw new VehichleException("Duplicate ID");
                }
            }
        }
    }

}
