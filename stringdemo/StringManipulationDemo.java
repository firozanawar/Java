package stringdemo;

public class StringManipulationDemo {
    public static void main(String[] args) {
        //System.out.println(removeChar("Firoz", 'r'));
        //subSequence("www.journaldev.com");

        String s = "Java String Quiz";
        System.out.println(s.substring(5,8));
    }

    /**
     * Remove given character from the String.
     * <p>
     * We can use replaceAll method to replace all the occurance of a String with another String.
     * The important point to note is that it accepts String as argument, so we will use
     * Character class to create String and use it to replace all the characters with empty String.
     */
    private static String removeChar(String str, char c) {
        if (str == null) return null;
        return str.replaceAll(Character.toString(c), "");
    }

    private static void subSequence(String str) {
        if (str == null) return;
        System.out.println("Last 4 char string : " + str.subSequence(str.length() - 4, str.length()));
        System.out.println("First 4 char string : " + str.subSequence(0, 4));
        System.out.println("Website anem : " + str.subSequence(4, 14));
        System.out.println("substring == subSequence: " + str.substring(4, 14) == str.subSequence(4,14));
        System.out.println("substring equals subSequence: " + str.substring(4, 14).equals(str.subSequence(4,14)));
    }
}
