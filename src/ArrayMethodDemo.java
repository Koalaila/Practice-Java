import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + " >> ");
            numbers[i] = input.nextInt();
        }
        
        // Call methods
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, 12);
        displayHigherThanAverage(numbers);
    }

    // Method to display all integers
    public static void display(int[] arr) {
        System.out.print("The numbers are ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display integers in reverse order
    public static void displayReverse(int[] arr) {
        System.out.print("The numbers in reverse order are ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to display the sum of all integers
    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of all numbers is " + sum);
    }

    // Method to display integers less than a specified value
    public static void displayLessThan(int[] arr, int limit) {
        System.out.print("Numbers less than the limit " + limit + " are ");
        boolean found = false;
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("none");
        } else {
            System.out.println();
        }
    }

    // Method to display integers higher than the average
    public static void displayHigherThanAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;
        System.out.printf("The average is %.1f\n", average);
        System.out.print("Numbers greater than the average are ");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
