public class App {
    public static void main(String[] args) throws Exception {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive();

        Vehicle bike = vehicleFactory.getVehicle("BIKE");
        bike.drive();
    }
}
