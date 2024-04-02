package practice2;

public class SwappingNumbers {
    // swapping of number using third variable
    public static void swapNumbers(int a , int b){
        int c = b;
        b = a;
        a = c;

        System.out.println("The Swapped numbers are  : " + " a = " + a + " and  b = " + b);
        // TimeComplecity O(1)
    }


  // second apporach without any third variabel

    public static void swapWithout(int a , int b){
         b = b + a;
         a = b - a; // here a = 40 - 10;
         b = b - a ; // here b = 40 -30;
        System.out.println("The Swapped numbers are  : " + " a = " + a + " and  b = " + b);
        // TimeComplecity O(1)
    }

    public static void main(String[] args) {
//         swapNumbers(10,30);
        swapWithout(10,30);
    }
}
