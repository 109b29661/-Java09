class math{

static int a = 0;


    static void add2n(int n) {
    	
    	for(int i=0;i<n;i++)
    		
    		a += i;
    		System.out.println("1+2+...+"+n+"="+a);
    	
    }
}


public class class06{
public static void main(String[] argv) {
	math.add2n(5);
	math.add2n(10);
	
}

}
