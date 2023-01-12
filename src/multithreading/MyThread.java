package multithreading;

import java.math.BigInteger;

public class MyThread extends Thread {
    private final int number;

    public MyThread(int number) {
        this.number = number;
    }

    public void run() {
        System.out.printf("Factorial of number %s is %s%n", number, factorial(number));
    }

    public static BigInteger factorial(int number) { //*method to find the factorial
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
