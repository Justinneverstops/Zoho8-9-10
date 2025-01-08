public class Missing {

        public static void main(String[] args) {
            // Example input
            int[] arr = {1, 2, 3, 5,4,6,7,9};
            int n = arr.length+1; // The range is from 1 to n
    
            // Calculate the sum of numbers from 1 to n
            int totalSum = 0;
            for (int i = 1; i <= n; i++) {
                totalSum += i;
            }
    
            // Calculate the sum of the array elements
            int arraySum = 0;
            for (int i = 0; i < arr.length; i++) {
                arraySum += arr[i];
            }
    
            // The missing element is the difference
            int missingElement = totalSum - arraySum;
    
            // Output the result
            System.out.println("The missing element is: " + missingElement);
        }
    }
    
    
