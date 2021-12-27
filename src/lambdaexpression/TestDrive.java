package lambdaexpression;

public class TestDrive {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("Car must have engine to start the car");
            }

            @Override
            public void stop() {
                System.out.println("Car must have break system to stop the car");
            }
        };

        car.start();
        car.stop();

        Engine engine = (num1, num2) -> System.out.println(num1+num2);
        engine.fly(100,50);

        Vehicle vehicle = () -> System.out.println("Let's move the vehicle");
        vehicle.move();

        RideSharing rideSharing = r -> System.out.println(r);
        rideSharing.rideOnDemand("Ride with Uber and fare is unknown");

    }
}
