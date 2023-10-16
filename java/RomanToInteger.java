import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scr.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity
        int result = romanToint(romanNumeral, romanToInteger);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }

    static int romanToint(String romanNumeral, Map<Character, Integer> romanToInteger) {
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToInteger.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}
