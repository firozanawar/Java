public class PrefixPostfix {
    public static void main(String[] args) {

        // Prefix: increments the current value and then passes it to the function.
        int i = 5;
        System.out.println(++i);

        // Postfix: passes the current value of i to the function and then increments it.
        int in = 7;
        System.out.println(in++);
        System.out.println(in++);
        System.out.println(in);
    }
}
