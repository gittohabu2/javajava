package course48;

import java.util.Random;
import java.util.Scanner;

public class Seki {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		int[][] seki = { { 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };

		System.out.println("席替えするよ");

		System.out.println("席替えの方法を選んでね");
		System.out.println("A.完全ランダム方式 B.自席指定方式");
		String x = stdIn.next();
		Random rand = new Random();
		if (x.equals("A")) {
			for (int i = 0; i < seki.length; i++) {
				for (int j = 0; j < seki.length; j++) {
					System.out.print(seki[i][j] + ",");
				}
				System.out.println();
			}
			System.out.println("席替えできたよ");
//			int[] kako = new int[36];
//			for (int i2 = 0; i2 < kako.length; i2++) {
//				if (kako[i2] == r) {
//					r = rand.nextInt(36) + 1;
//					i2 = -1;
//				}
//			}
//
//			for (int i2 = 0; i2 < kako.length; i2++) {
//				if(kako[i2] == 0) {
//					kako[i2] = r;
//				}
//			}
				for (int i = 0; i < seki.length; i++) {
					for (int j = 0; j < seki.length; j++) {
						int r = 1 + rand.nextInt(36);
						if(seki[i][j] != 0) {
							seki[i][j] = r;
							System.out.print(seki[i][j] + ",");
						}
					}
					System.out.println();
				}
		}
		}
	}

