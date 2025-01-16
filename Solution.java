public class Solution {
        public static int getRomanValue(char ch) {
            switch (ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default:
                    throw new IllegalArgumentException("Invalid Roman numeral character: " + ch);
            }
        }
        public static int romanToInt(String s) {
            int total = 0;
            int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char currentChar = s.charAt(i);
                int currentValue = getRomanValue(currentChar);

                if (currentValue < prevValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }

                prevValue = currentValue;
            }

            return total;
        }

        public static void main(String[] args) {
            String roman1 = "MCMXCIV";
            String roman2 = "LVIII";

            System.out.println("The integer value of " + roman1 + " is: " + romanToInt(roman1));
            System.out.println("The integer value of " + roman2 + " is: " + romanToInt(roman2));
        }
    }


