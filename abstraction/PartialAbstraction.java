abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    // @override ensures the method name in Vehicle matches with method name 
    // in the current class Car. If not it will throw an error.
    @Override
    void start() {
        System.out.println("Car started...");
    }

    @Override
    void stop() {
        System.out.println("Car stopped...");
    }
}

public class PartialAbstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
