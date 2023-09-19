package course40;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題１
		int number = 15;
		if (number >= 10) {
			System.out.println("でか！！！");

			//練習問題２
			int age = 20;
			if (age >= 18) {
				System.out.println("大人っすね！");
			} else {
				System.out.println("キッズだね＾＾");

				//練習問題３
				int score = 85;
				if (score >= 90) {
					System.out.println("Excellent");
					if (score >= 80 && score < 90) {
						System.out.println("Good");
					} else {
						System.out.println("勉強しましょう。");
					}
				}

				//練習問題４
				boolean isRaining = true;
				if (isRaining == true) {
					System.out.println("傘を持ってけーーー");
				} else {
					System.out.println("よい1日を！");
				}

				//
				int num = 2;
				if (num / 2 == 0) {
					System.out.println("偶数でっせ");
				} else {
					System.out.println("奇数だよ");
				}

				//
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}

				//
				for (int i2 = 0; i2 < 100; i2++) {
					if (i2 / 2 == 0) {
						System.out.println("現在" + i2 + "回目のループです。偶数です");
					}
				}

				//
				for (int i3 = 1; i3 < 10; i3--) {
					System.out.println(i3);
				}

				//
				int sum = 0;
				for (int i4 = 1; i4 <= 100; i4++) {
					sum = sum + i4;
				}
				System.out.println(sum);
			}
		}
	}

}
