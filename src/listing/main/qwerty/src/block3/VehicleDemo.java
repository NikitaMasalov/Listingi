package listing.main.qwerty.src.block3;
class  Vehicle2{
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
 class VehicleDemo {
    public static void main(String[] args) {

            Vehicle2 car1 = new Vehicle2();
            car1.passengers =2;
            car1.wheels =6;
            car1.maxspeed=130;
            car1.burnup=30;
            double distance = car1.maxspeed * 0.5;
            System.out.println("За полчаса car1 может проехать");
            System.out.println(distance + " км.");
            car1=null;
        }
    }



