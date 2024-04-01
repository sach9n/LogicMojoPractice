package practice2;

public class getGcd2 {
    // getting the gcd by approcah 2
    // Using the Ecledian principle
    // (A,B) = (B ,R ) or the reminder
    // The formula is (A,B) = (A%B, B ) // the gcd is as long one reaches the Zero then the number left with zero is Gcd of the two mumbers

    // Example
    // (40,24)
    // by formula (40 ,24 ) == (40%24 , 24) step 1;
    // step 2 (24,16) === (24, 40%24);
    // step 3 (24%16, 16) === (8 , 16);
    // step 4 (16%8 , 8) == (0,8) == so the Gcd is 8


    public static void main(String[] args) {
        // now covert this in to code

        int a = 40;
        int b = 24;

        while(b >= 0){
            if(b > 0){
                a = a % b;
                b = a;
            }
            System.out.println(b);
        }
    }


}
