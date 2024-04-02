package practice2.BitManuplation;

public class Bits{

    // Understanding the set bits and get bits and clear bits and update bits

    // get the bits
    // to get the bit the formula or you need to use and& with the 1 << i right shift we get the bit at the element
    public static int getBits(int n, int i){
        return (n & (1 << i));// this will give the numbers
    }
  // get it boolean
    public static boolean get(int n , int i){
        if((n & (1 << i)) !=0){
            return true;
        }else {
            return false;
        }
    }

    // Now understanding the set bits
    public static int setBits(int n , int i ){
        return (n | (1<<i));
    }

   // NOw understanding the Clear setbit

    public static int clearBit(int n, int i){
        return (n & ~(1<<i));// O(logn) // all bit sections
    }


    // Now check the power  of or not

    public static int isPowerOf2(int n){
        int x = 0; // first bit 2^0 == 0

        while( x<<1 <= n){  // 0<< 1 <= 8~ in binary  is 1000
            // step two 1<< 1 <= 8  0010 <= 1000
            //step  three 2<<1 <=8 == 0100 < =1000
            // step four 3 << 1 <=8 == 1000 = 1000 2^3 == 8 we get the
             x++; // 0 + 1 = 1 // 1+1 =2 // 2 +1 // 3+1
        }
        return x-1;
        // time complexity is O(log n)time complexity
    }

   // Count all setbits
    // we can use the above method just try
    public static int countAllSetBits(int n){
       // in this we are trying to count all the set bits for an given number say 1010 ~ 2
        int counter = 0;
        while (n > 0){
            if(((n & 1)!= 0)) counter++;
            n = n>>1;// left shift
        }
        return counter;
    }


    public static void main(String[] args) {
//        System.out.println(getBits(10,3));
//        System.out.println(get(10,3));
     //   System.out.println(setBits(10,2));
//        System.out.println(clearBit(10,3));
//        System.out.println(isPowerOf2(16));
        System.out.println(countAllSetBits(256));
    }
}
