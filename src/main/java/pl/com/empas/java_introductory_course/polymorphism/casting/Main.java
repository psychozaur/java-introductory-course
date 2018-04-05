package pl.com.empas.java_introductory_course.polymorphism.casting;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle;

        Car car = new Car();

        Aeroplane plane = new Aeroplane();

        // up-casting is safe
        vehicle = car;
        vehicle.move();

        vehicle = plane;
        vehicle.move();

        // doesn't work
//        anotherVehicle.fly();

        // down-casting
        Aeroplane anotherPlane = (Aeroplane) vehicle;
        anotherPlane.fly();

        castToAeroplane(vehicle);

        // thanks god it doesn't work
//        String string = (String) vehicle;

        // but...
        Object object = plane;
        castToString(object);
    }

    public static void castToAeroplane(Vehicle vehicle) {
        System.out.println("castToAeroplane()");
        Aeroplane aeroplane = (Aeroplane) vehicle;
        aeroplane.fly();
    }

    public static void castToString(Object maybeString) {
        // boom
        String string = (String) maybeString;
        System.out.println("It's string: " + string);
    }
}
