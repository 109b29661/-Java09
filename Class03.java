package java09;
class Caaa{           //不可宣告為public，一個文件中只有與文件名稱相同的類別才能宣告為public
	                     
	private int value;//改成public，其他類別也能存取此變數，對執行此程式沒影響
	public Caaa() {
		value = 10;
		System.out.println("value="+value);
	}
	public Caaa(int i) {
		value=i;
		System.out.println("value="+value);
	}
}
public class Class03 
{
	public static void main(String args[]) {
    Caaa obj1 = new Caaa();//呼叫public Caaa()
    Caaa obj2 = new Caaa(12);//public Caaa(int i)
}
}
