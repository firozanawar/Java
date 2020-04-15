import java.util.HashMap;
import java.util.Scanner;

/**
 * Find The First Non Repeated Character In A String
 *
 * Pseudo Algorithm
 *
 * 1.   First create the  character count hash table .
 *
 *           For each character
 *             If there is no value stored in the character
 *                      set it to 1 .
 *             else
 *                      increment the value of the character by 1 .
 *
 * 2.  Scan the string
 *            For each character
 *            return character if the count in hash table is 1 .
 *            If no character have count 1 , return null
 */
public class FirstNonRepeated {

    public static void main(String[] args) {

        System.out.println(" Please enter the input string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Solution 1
        char c = firstNonRepeatedCharacter(str);
        System.out.println("The first non repeated character is :  " + c);

        // Solution 2
        firstNonRepeatedCharacter2(str);
    }

    private static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int strLength = str.length();
        Character c;

        for (int i = 0; i < strLength; i++) {
             c = str.charAt(i);
             if(map.containsKey(c)){

                 // increment count corresponding to c
                 map.put(c, map.get(c)+1);
             }else{
                 map.put(c,1);
             }
        }

        for (int i = 0; i <strLength ; i++) {
            c = str.charAt(i);
            if(map.get(c) == 1)
                return c;
        }
        return null;
    }

    private static void firstNonRepeatedCharacter2(String str){
        for (char i : str.toCharArray()){
            if(str.indexOf(i) ==str.lastIndexOf(i)){
                System.out.println("The first non repeated character is :  " +i);
                break;
            }
        }
    }
}
