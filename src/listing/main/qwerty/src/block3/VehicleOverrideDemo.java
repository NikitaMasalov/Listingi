package listing.main.qwerty.src.block3;

class Vehicle11 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle11(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels (wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }
    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int hetMaxSpeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels (int wheels) {
        if ((wheels<1) || (wheels>24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }
    Vehicle11() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }
    public String toString() {
        return "Vehicle(passengers=" + passengers + ";" +
                "wheels=" + wheels + ";" +
                "maxspeed=" + maxspeed + ";" +
                "burnup=" + burnup +
                ")";
    }
}
class Auto extends Vehicle11 {
    boolean sunroof;
    Auto(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }
    Auto(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}
class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle11 v = new Vehicle11(2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());
    }
}
