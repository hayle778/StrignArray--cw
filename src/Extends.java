import java.util.Random;
import java.util.Scanner;

/* Complete initialized array/ Scanner values and use for- loops to iterate and print out sum of entry*/
public class Extends {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        int[] intArray = new int [10]; // declaring array to hold ten text scores
        int sum = 0;
        double avg = 0;
        // initalize the elements of the array

        for (int i = 0; i < 10;  i++) {
            System.out.println("Enter a number numbers;");
            intArray[i] =keybd.nextInt();
            sum += intArray[i];
            keybd.nextLine();
        }
        avg = sum / 10.0;
    System.out.println("The sum is" + sum);
        System.out.println("The average is " + sum/10);
    }}