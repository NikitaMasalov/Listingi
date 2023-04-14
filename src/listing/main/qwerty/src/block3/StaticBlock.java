package listing.main.qwerty.src.block3;

public class StaticBlock {
    static double rootof9;
    static double rootof27;
    int number;

    static {
        System.out.println("Инициализация статических членов класса....");
        rootof9 = Math.sqrt(9.0);
        rootof27 = Math.sqrt(27.0);
    }
    StaticBlock(int number) {
        System.out.println("Инициализация переменных экземпляра класса....");
        this.number = number;
    }
}
class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Корень из 9 равен " +StaticBlock.rootof9);
        System.out.println("Корень из 27 равен " +StaticBlock.rootof27);

        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1.number = " + sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb2.number = " + sb2.number);
    }
}


