package arrayManipuleren;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int [20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(120) + 1;
        }
        System.out.println("De som is: " + calcSum(arr));
        arr = reverseArray(arr);
        System.out.println(printArray(arr));
        arr = squareArray(arr);
        System.out.println(printArray(arr));
        mergeSort(arr);




    }
    //calculates sum of an array of integers;
    public static int calcSum(int [] intArr){
        int total = 0;
        for (int a : intArr){
            total += a;
        }
        return total;
    }

    //reverses an array of integers;
    public static int [] reverseArray(int [] intArr){
        int [] temp = new int [intArr.length];
        for (int i = 0; i < intArr.length; i++){
            temp[i] = intArr[intArr.length-1-i];
        }
        intArr = temp;
        return intArr;
    }

    //returns array, every element will be replaced by it's 2nd might
    public static int [] squareArray(int [] intArr){
        int [] temp = new int [intArr.length];
        for (int i = 0; i < intArr.length; i++){
            temp[i] = (intArr[i]*intArr[i]);
        }
        intArr = temp;
        return intArr;
    }

    //prints array
    public static String printArray(int [] intArr){
        String print = "[ ";
        for (int i : intArr){
            print = print.concat(" " + (i) + " ");
        }
        print = print.concat("]");
        return print;
    }

    //mergeSort algoritme
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] intArr){
        sort(intArr,0,intArr.length-1);
        System.out.println(printArray(intArr));
    }


}
