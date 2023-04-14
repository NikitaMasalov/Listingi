package listing.main.qwerty.src.block2;

public class HupotDemo {
    public static void main (String[] args){
        double cathetus1, cathetus2, hypot;
        cathetus1 = 3;
        cathetus2 = 4;
        hypot=Math.sqrt ((cathetus1*cathetus2)+(cathetus2*cathetus1));
        System.out.println("длина гипотемузы равна"+hypot);
    }
}
