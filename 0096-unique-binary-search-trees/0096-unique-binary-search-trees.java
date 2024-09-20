import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        }

        // Using BigInteger for large numbers
        BigInteger kn = factorial(2 * n);  // (2n)!
        BigInteger kk = factorial(n + 1);  // (n+1)!
        BigInteger nn = factorial(n);      // n!

        // Calculate the Catalan number: (2n)! / ((n+1)! * n!)
        BigInteger result = kn.divide(kk.multiply(nn));

        // Convert the BigInteger result back to int
        return result.intValue();
    }

    public BigInteger factorial(int nn) {
        // Start with BigInteger value 1
        BigInteger fact = BigInteger.ONE;

        // Calculate factorial using BigInteger
        for (int i = 2; i <= nn; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
