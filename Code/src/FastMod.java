
public class FastMod {
public static void main(String[] args) {
	System.out.println(fast_exp(2,9,2));
	
}

public static long  fast_exp(int base, int exp,int MOD) {
    long res=1;
    while(exp>0) {
       if(exp%2==1) 
    	   res=(res*base)%MOD;
       base=(base*base)%MOD;
       exp/=2;
    }
    return res;
}

}
