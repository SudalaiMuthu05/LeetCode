import java.lang.*;
import java.math.*;

class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                sumEven+=i; 
            }
            else{
                sumOdd+=i;
            }
        }
        String s1 = String.valueOf(sumEven);
        String s2 = String.valueOf(sumOdd);
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);

        BigInteger gcdd = num2.gcd(num1);
        return gcdd.intValue();
    }
}