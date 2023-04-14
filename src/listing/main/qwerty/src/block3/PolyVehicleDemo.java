package listing.main.qwerty.src.block3;

class Vehicle12 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle12(int passengers, int wheels, int maxspeed, int burnup) {
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
    Vehicle12() {
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
class Auto1 extends Vehicle12 {
    boolean sunroof;
    Auto1(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }
    Auto1(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}
class PolyVehicleDemo {
    public static void main(String[] args){

        Auto1 a = new Auto1(true);
        Vehicle11 v = new Vehicle11();
        Vehicle11[] pvd = { v};

        for (int i = 0; i < pvd.length; i++){
            System.out.println(pvd[i].toString());
        }
    }
}
