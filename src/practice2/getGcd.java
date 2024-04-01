package practice2;

public class getGcd {

    public static int getGcd(int a, int b){
        int minValue = Math.min(a ,b);

        while(minValue > 0){
            if(a % minValue == 0 && b % minValue == 0){
//                System.out.println("The Gcd or HCF of "+ minValue);
            }
            minValue--;
        }
        return  minValue;
    }

    public static void main(String[] args) {
      int gcd  =  getGcd(60,36);
        System.out.println();
    }
}
