public class Primes {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(2);
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int j = 3; j * j <= num; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
