package ss2_loop_array;

import java.util.Arrays;

public class Demo {
    byte a; // a = 0. Tuongw tuwj short va int
    long b; //b = 0L
    float c; // c = 0.0f;
    double d; // d = 0.0
    boolean e; //e = false
    char f; //f = \u0000

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 5;
        arr[2] = 1;
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//        for(int i: arr) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        Arrays.stream(arr).forEach(System.out::println);
//        Arrays.stream(arr).filter(value -> value > 0).forEach(System.out::println);
//        Arrays.stream(arr).max().ifPresent(System.out::println);
        int present = 0;
        for (int i : arr) {
            present += i;
        }

        ss3_method.Demo.isPrime(23);
//        Arrays.stream(arr).reduce((value, present) -> value + present).ifPresent(System.out::println);
        Arrays.stream(arr).map(value -> value * 2).forEach(System.out::println);
    }
}
