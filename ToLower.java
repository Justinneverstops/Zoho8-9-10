import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = ""; // To store the converted string

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); // Convert to lowercase
            }
            // Check if the character is lowercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32); // Convert to uppercase
            }
            // If it's neither, append as is (e.g., space, digit, punctuation)
            else {
                result += ch;
            }
        }

        System.out.println("Converted string: " + result);
    }
}

  

