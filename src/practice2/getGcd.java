package practice2;

public class getGcd {

    // Highest common factor
    public static  void  getGcd(int a,int b) {
        int minValue = Math.min(a, b);

        while (minValue > 0) {
            if (a % minValue == 0 && b % minValue == 0) {
                System.out.println("Gcd of a and b is : " + minValue);
                return;
            }
            minValue--;
        }
    }
    // O (min(a,b)) ~ O(b)

    // recursion gcd

    public static void main(String[] args) {
       getGcd(60,96);

    }
}
