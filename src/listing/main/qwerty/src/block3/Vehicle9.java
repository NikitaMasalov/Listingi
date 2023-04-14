package listing.main.qwerty.src.block3;

class Vehicle9 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle9() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }

    Vehicle9(int passengers,int wheels,int maxspeed,int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }

    Vehicle9 ferrari;

    {
        ferrari = new Vehicle9(2, 4, 360, 12);
    }

    Vehicle9 moskvich = new Vehicle9();
}
