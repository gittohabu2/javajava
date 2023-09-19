package course41;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String moji = "模擬テスト。100点取ります。";
		System.out.println(moji);

		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);

		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();
		System.out.println(a);

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "回目のループです");

			int x2 = stdIn.nextInt();
			if (x2 >= 50) {
				System.out.println("50以上です。");
			} else {
				System.out.println("49以下です。");
			}

			boolean isRaining = true;
			if (isRaining == true) {
				System.out.println("傘を持ってけーーー");
			} else {
				System.out.println("良い1日を！");
			}

			int[] numArr = { 10, 50, 30, 20, 40 };

			for (int num : numArr) {
				System.out.println(num);
			}

			for (int i2 = 0; i2 < 5; i2++) {
				if (numArr[4] < numArr[i]) {
					numArr[4] = numArr[i];
				}
			}
			
			int x4 = stdIn.nextInt();
			int[] variable = new int[x4];

			mogi();
			calc(10,11);
			String x5 = mojicon("今のところ全問正解でしょ？");
		}
	}
	
	static void mogi() {
		System.out.println("メソッド問題");
	}
	
	static void calc(int a,int b) {
		System.out.println(a+b);
		
	}

    static String mojicon(String moji) {
    	String concated = moji + "を受け取りました";
    	return concated;
    }
}
