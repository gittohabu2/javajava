package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//課題①
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };

		System.out.println("7月の台風は" + typhoon[6] + "件です。");

		//課題②
		int[] typhoon1 = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };

		int i = 1;
		for (int num : typhoon1) {
			int i2 = i++;
			System.out.println(i2 + "月の台風は" + num + "件です。");

			//課題③
		int[] typhoon2 = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };

		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください。");
		System.out.println("1:台風件数 2:地震件数 3:降水量");

		int x = stdIn.nextInt();

		System.out.println("年月か月別かを選んでください。");
		System.out.println("1:年月 2:月別");

		int y = stdIn.nextInt();

		int sum = 0;
		if (y == 1 && x == 1) {
			for (int ii = 0; ii < typhoon2.length; ii++)
				sum = sum + typhoon2[ii];
			System.out.println("1年間に起こった台風の総合計は" + sum + "件です。");
		}
		if (y == 1 && x == 2) {
			for (int iii = 0; iii < quake.length; iii++)
				sum = sum + quake[iii];
			System.out.println("1年間に起こった地震の総合計は" + sum + "件です。");
		}
		if (y == 1 && x == 3) {
			for (int iiii = 0; iiii < rain.length; iiii++)
				sum = sum + rain[iiii];
			System.out.println("1年間に起こった降水量の総合計は" + sum + "mmです。");
		}
		 if (y == 2) {
			System.out.println("見たい月を入力してください。");
		}

		int z = stdIn.nextInt();

		if (1 <= z && z <= 12 && x == 1) {
			System.out.println(z + "月の台風件数は" + typhoon2[z - 1] + "件です。");
		}
		if (1 <= z && z <= 12 && x == 2) {
			System.out.println(z + "月の地震件数は" + quake[z - 1] + "件です。");
		}
		if (1 <= z && z <= 12 && x == 3) {
			System.out.println(z + "月の降水量は" + rain[z - 1] + "mmです。");
		}
		break;
		}

	}
}
