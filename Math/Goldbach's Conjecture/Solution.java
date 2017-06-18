import java.lang.*;
import java.util.*;

public class Solution{
    public ArrayList<Integer> primesum(int a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < a; i++){
            if(isPrime(i) && isPrime(a-i)){
                list.add(i);
                list.add(a-i);
                return list;
            }
        }
        return list;
    }

    boolean isPrime(int a){
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i ==0) return false;
        }
        return true;
    }
}
