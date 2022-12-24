package LeetCode;

public class Temp {

    public static int convertStringToInt(String input) {
        if(input.length() == 1) {
            return input.charAt(0) - '0';
        }
        int smallOutput = convertStringToInt(input.substring(0, input.length()-1));
        int lastDigit = input.charAt(input.length()-1) - '0';
        return smallOutput*10 + lastDigit;

    }
    public static void main(String[] args) {
        String s = new String("abcde");
        System.out.println(s.substring(2));

        int ans = convertStringToInt(s);
        System.out.println(ans);

    }
}
