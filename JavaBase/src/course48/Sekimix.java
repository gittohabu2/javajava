package course48;

import java.util.Random;
import java.util.Scanner;

public class Sekimix {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		/////要素数の設定/////
		int[] num = new int[36];
		int[][] seki = new int[6][6];

		/////席替え方法の選択/////
		System.out.println("席替えするよ");
		System.out.println("席替えの方法を選んでね");
		System.out.println("1.完全ランダム方式 2.自席指定方式");
		int x = stdIn.nextInt();

		Random rand = new Random();

		///////完全ランダム方式///////
		if (x == 1) {
			int a = 0;

			//乱数生成
			for (int i = 0; i < num.length; i++) {
				int r = 1 + rand.nextInt(36);

				//重複確認
				for (int j = 0; j < num.length; j++) {
					if (num[j] == r) {
						a++;
					}
				}

				if (a > 0) {
					i--;

					a = 0;

					continue;

				} else {

					num[i] = r;
				}

			}

			///////自席指定方式///////
		} else if (x == 2) {
			int a = 0;

			//自席を指定
			for (int i = 0; i < num.length; i++) {

				System.out.println("左上から順に番号を入力してください");
				int y = stdIn.nextInt();

				//重複確認
				for (int j = 0; j < num.length; j++) {
					if (num[j] == y) {
						a++;
					}
				}

				if (a > 0) {
					i--;

					a = 0;

					continue;

				} else {

					num[i] = y;
				}

			}

		}
		//席替え後の席を表示
		

			int l = 0;

			for (int xx = 0; xx < 6; xx++) {
				for (int yy = 0; yy < 6; yy++) {

					seki[xx][yy] = num[l];

					if (seki[xx][yy] < 10) {
						System.out.print(" " + seki[xx][yy] + "|");
						l++;
					} else if (seki[xx][yy] >= 10) {
						System.out.print(seki[xx][yy] + "|");
						l++;
					}
				}
				System.out.println();
			}

			/////席の最終確認/////
			while (true) {
			System.out.println("席を確定しますか？");
			System.out.println("1,このまま確定する");
			System.out.println("2、変更する");
			int x10 = stdIn.nextInt();

			//確定の場合の席表示
			if (x10 == 1) {
				System.out.println("席替えできたよ");
				break;
			}
			//変更の場合の席座標入力
			if (x10 == 2) {
				System.out.println("入れ替え元を入力してね[0][0]の左側");
				int x1 = stdIn.nextInt();

				System.out.println("入れ替え元を入力してね[0][0]の右側");
				int x2 = stdIn.nextInt();

				System.out.println("入れ替え先を入力してね[0][0]の左側");
				int z1 = stdIn.nextInt();

				System.out.println("入れ替え先を入力してね[0][0]の右側");
				int z2 = stdIn.nextInt();

				///入れ替え実行///
				int save = seki[z1][z2];
				seki[z1][z2] = seki[x1][x2];
				seki[x1][x2] = save;

				for (int xx = 0; xx < 6; xx++) {
					for (int yy = 0; yy < 6; yy++) {

						if (seki[xx][yy] < 10) {
							System.out.print(" " + seki[xx][yy] + "|");
							l++;
						} else if (seki[xx][yy] >= 10) {
							System.out.print(seki[xx][yy] + "|");
							l++;
						}
					}
					System.out.println();
				}
			}
		}
	}
}