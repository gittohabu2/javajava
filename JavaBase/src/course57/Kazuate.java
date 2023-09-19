package course57;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {

	public static void main(String[] args) {

		Random rnd = new Random();
		int ransu = rnd.nextInt(100) + 1;
		Scanner stdIn = new Scanner(System.in);
		int count = 1;

		while (true) {
			System.out.println("数字を入力してね");
			int a = stdIn.nextInt();

			if (ransu == a) {
				System.out.println("おめでとう！");
				System.out.println(count + "回目でクリア！！");
				break;
			} else if (ransu > a) {
				System.out.println("残念！");
				System.out.println("答えはもっと大きい数字だよ");
				count = count + 1;
			} else {
				System.out.println("残念！");
				System.out.println("答えはもっと小さい数字だよ");
				count = count + 1;
			}

		}

	}

}
