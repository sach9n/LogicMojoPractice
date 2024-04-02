package practice2;

public class getFibbonacchi {
    public static void getFibonacchi(int fib){
        // seed numbers
     int a = 0;
     int b = 1;

     for(int i =0; i <= fib ; i++)
     {
         int c= a + b ;
         a = b;
         b = c;
         System.out.println(a);
     }

  // O(n)
    }


    // method two

    public  static void getFibOneVariable(int n){
        // seed numbers
        int a = 0;
       int b = 1;

       for(int i =0;i <= n; i++){
           b = a + b;
           a = b - a;

           System.out.println(a);
           // this approach is with out using third variable fine
           // Time Complicity is O(n)
       }
    }
    public static void main(String[] args) {
//        getFibonacchi(10);
        getFibOneVariable(10);
    }
}
