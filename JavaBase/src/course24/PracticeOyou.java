package course24;

import java.util.Scanner;

public class PracticeOyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("足し算か引き算か選べ");
		System.out.println("1:足し算 2:引き算");

		String a = stdIn.next();

		System.out.println("計算する文字を入力して");

		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		if (a.equals("1")) {
			plus(x, y);
		} else {
			minus(x, y);
		}
	}

	static void plus(int x, int y) {
		System.out.println(x + y);
	}

	static void minus(int x, int y) {
		System.out.println(x - y);
	}

}
