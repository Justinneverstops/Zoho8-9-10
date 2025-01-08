public class PaalindromeString{
public static void main(String[] args) {
    String testString = "A man a plan a canal Panama";
    int n=testString.length();
    char[] cleanChar = new char[n];
    int newLength = 0;
    int check=0;

    for(int i=0;i<n;i++){
        char ch=testString.charAt(i);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            // Convert to lowercase manually if it is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            cleanChar[newLength]=ch;
            newLength++;
        }
    }
    for (int i = 0; i < newLength / 2; i++) {
        if (cleanChar[i] != cleanChar[newLength - i - 1]) {
            check++;
        }
    }

    if(check==0){
        System.out.println("The string is a palindrome");
    }
    else
    System.out.println("The string is a NOT a palindrome");
    }

}