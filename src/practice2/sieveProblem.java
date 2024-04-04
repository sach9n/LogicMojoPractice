package practice2;
import java.util.*;
public class sieveProblem {
    // Sieve of Eratosthenes
    // this is mmuch optimized form of prime finds of n numbers O(nlognlogn)

    public static int sieveOfEratosthenes(int n){
        boolean[]isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        for(int i = 2; i<=Math.sqrt(n);i++){
            if(isPrime[i]) {
                for (int j = i * i; j < n; j += i) isPrime[j] = false;
            }
        }
        int primeCount = 0;
        for(int i=2; i < n; i++){
            if(isPrime[i]){
                System.out.println(i);
                primeCount++;
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        int Prime  = sieveOfEratosthenes(52);
        System.out.println(Prime);
    }


}

