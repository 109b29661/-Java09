class math{
 



    static void power(int x,int n) {
    	 int a = 1;
    	for(int i=0;i<n;i++)
    		
    		a *= x;
    		
    		System.out.println(x+"的"+n + "次方="+a);
    	
    }
}


public class class07{
public static void main(String[] argv) {
	math.power(2,5);
	math.power(3,2);
	
}

}
