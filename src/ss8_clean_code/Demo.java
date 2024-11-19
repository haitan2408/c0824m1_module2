package ss8_clean_code;

import java.util.Scanner;

public class Demo {

    public static final int TWO = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if(number < TWO) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number %i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
