public class ArrayTodigit {
        public static void main(String[] args) {
            // Example input
            int[] nums = {131, 11, 48,543,123456};
    
            // Array to keep track of seen digits (0-9)
            boolean[] seen = new boolean[10];
    
            // Loop through each number in the array
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
    
                // Extract digits of the current number
                while (num > 0) {
                    int digit = num % 10; // Get the last digit
                    seen[digit] = true;  // Mark the digit as seen
                    num = num / 10;      // Remove the last digit
                }
            }
    
            // Print all distinct digits
            System.out.print("Distinct digits: ");
            for (int i = 0; i < 10; i++) {
                if (seen[i]) {
                    System.out.print(i + " ");
                }
            }
        }
}
    
    



           /*  public static void main(String[] args) {
            int[] nums = {131, 11, 48};
            int[] digits = new int[10];
            String result="";
            int count=0;
        for(int i=0;i<nums.length-1;i++){
            int num=nums[i];
        //for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                digits[digit]++;
                num /= 10;
                result=result+digit;
                count++;
            }
        }
        System.out.

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
*/