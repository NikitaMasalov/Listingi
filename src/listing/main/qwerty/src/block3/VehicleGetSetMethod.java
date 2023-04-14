package listing.main.qwerty.src.block3;

class Vehicle8 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle8(int passengers, int wheels, int maxspeed, int burnup) {
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

    public String getMaxSpeed() {
        return null;
    }
}
class VehicleGetSetMethod {
    public static void main(String[] args) {
        Vehicle8 ferrari = new Vehicle8(2,-2,360,12);
        System.out.println("Max скорость: " + ferrari.getMaxSpeed() + "км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Число колес (повторно): " +ferrari.getWheels());

    }
}
