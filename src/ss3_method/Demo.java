package ss3_method;

import java.math.BigInteger;

public class Demo {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.isPrime(23);
        int a = 5;
        int b = 6;
        int[] arr = {a, b};
        Demo.swap(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
//    a = 5, b = 6
//    public static void swap(int c, int d) {
//        int temp = c; //temp = 5
//        c = d; //a = 6
//        d = temp; //b = 5
//    }
// arr = {5, 6}
    public static void swap(int[]arr1) {
        int temp = arr1[0]; //temp = 5
        arr1[0] = arr1[1]; //arr[0] = 6
        arr1[1] = temp; //arr[1] = 5
    }
}
