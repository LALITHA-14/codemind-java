public class PrimeBooleanTask{
    static boolean prime(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors++;
        }
        if (factors == 2)
            return true;
        return false;
    }
 
    static boolean prime(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (prime(i))
                count++;
        }
        if (count % 2 == 0)
            return true;
        return false;
    }
 
    static boolean prime(int a, int b, int count) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (prime(i))
                c++;
        }
        if (c == count)
            return true;
        return false;
    }
 
    public static void main(String[] args) {
        System.out.println(prime(4));
        System.out.println(prime(5));
        System.out.println(prime(10, 20));
        System.out.println(prime(20, 31));
        System.out.println(prime(10, 20, 4));
        System.out.println(prime(10, 20, 3));
    }
}
