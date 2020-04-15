package stringdemo;

public class Palindrome {
    public static void main(String[] args) {
        //System.out.println(isPalindrome("ada"));
        System.out.println(isPalindromeString("adada"));
    }

    private static boolean isPalindrome(String str){
        if(str == null) return false;
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);
    }

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
