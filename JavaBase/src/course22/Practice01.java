package course22;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題①
		String[][] ox = new String[3][3];
		ox[0][0] = "o";
		ox[0][1] = "x";
		ox[0][2] = "o";

		ox[1][0] = "x";
		ox[1][1] = "o";
		ox[1][2] = "x";

		ox[2][0] = "o";
		ox[2][1] = "o";
		ox[2][2] = "o";

		System.out.println(ox[2][1]);

		//練習問題②
		System.out.println(Arrays.deepToString(ox));

		//練習問題③
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + ox[i][j]);
				if (ox[i][j].equals("o")) {
					count = count + 1;
				}
			}
			System.out.println(count);
		}
	}

}
