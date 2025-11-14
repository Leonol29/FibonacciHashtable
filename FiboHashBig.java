import java.math.BigInteger;
import java.util.Hashtable;

public class FiboHashBig {
    static Hashtable<Integer, BigInteger> memoria = new Hashtable<>();
    static {
        memoria.put(0, BigInteger.ZERO);
        memoria.put(1, BigInteger.ONE);
    }

    public static BigInteger fibonacci(int n) {
        if (memoria.containsKey(n)) return memoria.get(n);
        BigInteger val = fibonacci(n - 1).add(fibonacci(n - 2));
        memoria.put(n, val);
        return val;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(200)); // ejemplo
    }
}

