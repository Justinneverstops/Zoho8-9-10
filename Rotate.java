public class Rotate {
        public static void main(String[] args) {
            // Example input
            int[] arr = {1, 2, 3, 4, 5};
            int n = arr.length;
            int k = 4; // Number of steps to rotate
    
            // Ensure k is within bounds of array length
            k = k % n;
    
            // Rotate the array
            int[] rotatedArr = new int[n];
    
            // Fill rotated array
            for (int i = 0; i < n; i++) {
                // Compute new position for each element
                int newPosition = (i - k + n) % n; // Ensure it stays within bounds
                rotatedArr[newPosition] = arr[i];
            }
    
            // Print the rotated array
            System.out.print("Rotated array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(rotatedArr[i] + " ");
            }
        }
}
    
    

