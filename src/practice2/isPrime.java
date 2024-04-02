package practice2;

public class isPrime {
    // use the brute force
    // check the give number is prime or not

    public static void  isPrime(int n){

        if(n < 2){
            System.out.println("This is not Prime nor Composite ");
        }

        for(int i = 2; i < n ; i++){
            if(n %i == 0){
                System.out.println( n + " is  not a prime number ");
                return;
            }
        }
        System.out.println( n + " is a PRIME number ");

        // This will take O(n) time Complexity So we can Optimize it to root n

    }


    // Is PRime root n time complexity
    // understanding the hypothisis we know that going to the n time is not required in this case as you can see you  can
    // just itrate it till the root time you will get the same result

    // lets code

    public static void isPRIME(int n ){
        // now we take Square root of the n and itrate it to that number and come to solution
        if(n < 2){
            System.out.println( n + "is not Prime nor Composite");
        }

        for(int i  = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0 ){
                System.out.println(n + " is not a PRime number");
                return;
            }
        }
        System.out.println(n + " is a PRIME number");
        // this one is of O(rootn)time complixity
    }

// one more optimicxxe way o

    public static void main(String[] args) {
//        isPrime(9);
        isPRIME(27);
    }
}
