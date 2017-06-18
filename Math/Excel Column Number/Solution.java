public class Solution {
	public int titleToNumber(String a) {
	    int length = a.length();
	    int sum = 0;
	    int j=0;
	    for(int i = length-1; i>=0; i--){
	        sum += Math.pow(26,j)*(a.charAt(length-(j+1)) - 'A' + 1);
	        j++;
	    }
	    return sum;
	}
}
