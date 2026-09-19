public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Factory Method (Part A) ---");
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        twoWheelerFactory.deliverVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        fourWheelerFactory.deliverVehicle();

        System.out.println("\n--- Testing Abstract Factory (Part B) ---");
        VehiclePartFactory twoWheelerParts = new TwoWheelerPartFactory();
        VehicleClient twoWheelerClient = new VehicleClient(twoWheelerParts);
        twoWheelerClient.assembleVehicle();

        System.out.println();
        VehiclePartFactory fourWheelerParts = new FourWheelerPartFactory();
        VehicleClient fourWheelerClient = new VehicleClient(fourWheelerParts);
        fourWheelerClient.assembleVehicle();
    }
}