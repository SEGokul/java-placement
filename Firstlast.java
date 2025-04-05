import java.util.Scanner;
public class Firstlast {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        scanner.close();

        int first = -1, last = -1;

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid; 
                right = mid - 1; 
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        
        left = 0; right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid; 
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        
        System.out.println("[" + first + ", " + last + "]");
    }
}


