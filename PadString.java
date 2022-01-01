package testpackage;

public class PadString {

    // This method takes two inputs a String and an Integer
    // And checks if the string length is greater or equal than number
    // If true it returns the String
    // If not it adds spaces to account for the difference in length.
    // ex: Hello , 8 : Hello is 5 letters , then 5<8 Then it adds 3 spaces to Hello
    public static String padString(String s, int x) {
        String result = s;
        if (s.length() >= x) {
            return result;
        } else {
            for (int i = s.length(); i < x; i++) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(padString("Hello", 8));
    }
}
