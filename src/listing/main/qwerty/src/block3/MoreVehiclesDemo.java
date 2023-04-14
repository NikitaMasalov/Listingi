package listing.main.qwerty.src.block3;

class Vehicle1 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
class  MoreVehiclesDemo{
    public void main (String[] args) {

        Vehicle1 car1 = new Vehicle1();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle1 bus1 = new Vehicle1();
        bus1.passengers = 45;
        bus1.wheels =4;
        bus1.maxspeed = 100;
        bus1.burnup = 45;

        double interval = 1.25;
        double distanceCar1 = car1.maxspeed * interval;
        double distanceBus1 = bus1.maxspeed * interval;

        System.out.print(distanceCar1 + "km c" + car1.passengers);
        System.out.print(distanceBus1 + "km c" + bus1.passengers);
    }
}


