package test;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomTestApp {
    public static void main(String[] args) {
        Random lotto = new Random();
        System.out.println("Enter the required array length: ");
        Scanner userInput = new Scanner(System.in);
        int lengthReq = userInput.nextInt();

        int[] arr = new int [lengthReq];
        for (int n = 0; n < arr.length;  n++){
            arr[n] = lotto.nextInt(101)+50;
        }

        System.out.println(Arrays.toString(arr));
        userInput.close();
    }
}
