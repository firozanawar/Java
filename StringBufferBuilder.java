public class StringBufferBuilder {

    public static void main(String[] args) {

        long startTime  = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer("hello");

        for (int i = 0; i <1000 ; i++) {
            sf.append("java");
        }

        System.out.println(System.currentTimeMillis() - startTime);

        startTime  = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("hello");

        for (int i = 0; i <1000 ; i++) {
            sb.append("java");
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
