package course25;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int z = modoriOne(134);
		System.out.println(z);
		
		String c = modoriTwo("文字！");
		System.out.println(c);
		
		int z2 = modoPraThree(333,555);
		System.out.println(z2);
	}

	static int modoriOne(int x ) {
		int num = x + 100;
		return num;
	}
	
	static String modoriTwo(String a) {
		String moji = a + "を受け取りました";
		return moji;
	}
	static int modoPraThree(int x,int y) {
		int sum = x + y;
		return sum;
	}
}
