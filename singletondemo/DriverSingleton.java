package singletondemo;

public class DriverSingleton {

    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from x is " + y.s);
        System.out.println("String from x is " + z.s);

        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from x is " + y.s);
        System.out.println("String from x is " + z.s);

        // Singleton using enum
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE ;
        enumSingleton.setString("FIROZ");
        System.out.println(enumSingleton.getS());

        EnumSingleton enumSingletonNew = EnumSingleton.INSTANCE ;
        System.out.println(enumSingletonNew.getS());
        enumSingleton.setString(enumSingleton.getS().toLowerCase());
        System.out.println(enumSingletonNew.getS());
    }
}
