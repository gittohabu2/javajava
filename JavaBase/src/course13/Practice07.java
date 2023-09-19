package course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してね。");
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println("現在" + i + "回目のループです。");

			if (100 <= i)
				System.out.println("どれだけ回すの");
			
			int xx = i % 2;

			if (xx == 0) {
				System.out.println("偶数だよ");
			} else {
				System.out.println("奇数だよ");

			}
		}
	}

}
