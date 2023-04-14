package listing.main.qwerty.src.block3;

class Vehicle7 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle7 (int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }

    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
}
class VehicleAccessDemo {
    public static void main(String[] args) {
        Vehicle7 ferrari = new Vehicle7(2,4,360,12);

        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за пол часа проедет" + distance + "км.");
        System.out.println("Скорость Ferrari :" + ferrari.maxspeed + "км/ч");
    }
}
