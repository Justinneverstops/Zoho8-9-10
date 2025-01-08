public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] reversed = new char[str.length()];
        System.out.println("Original String: " + str);
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }

        
        // Construct the reversed string manually
       String result = "";
        for (int i = 0; i < reversed.length; i++) {
           result += reversed[i];
       }
       System.out.println("Reversed String: " + result);
        }
}
