package coursePoke;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		Trainer poke1 = new Trainer();
		System.out.println("名前を設定して");
		String a = stdIn.next();
		int x1 = 0;
		while (x1 <= 0) {
			System.out.println("メニューを選択して");
			System.out.println("1・・・捕獲");
			System.out.println("2・・・図鑑を見る。");
			System.out.println("3・・・バトル");
			System.out.println("99・・・終了");
			int x = stdIn.nextInt();
			if (x == 1) {
				System.out.println("捕獲したいポケトンの名前を入力してね");
				String b = stdIn.next();
				System.out.println("捕獲したいポケトンのタイプ(炎、水、地面、草)を入力してね");
				String c = stdIn.next();
				System.out.println("捕獲したいポケトンの戦闘力を入力してね");
				int y = stdIn.nextInt();
				System.out.println("捕獲したいポケトンの捕獲難易度(1～10)を入力してね");
				int z = stdIn.nextInt();

				Pocketon poke2 = new Pocketon(b, c, y, z);
				poke1.capture(poke2);
				poke1.display();
			}

			if (x == 2) {
				poke1.display();
			}

			if (x == 3) {
				System.out.println("戦わせたいポケトンの名前を2体入力して");
				String p1 = stdIn.next();
				String p2 = stdIn.next();
				int t = 0;
				int t2 = 0;

				for (int i = 0; i < poke1.myPockes.length; i++) {
					if (poke1.myPockes[i] != null) {
						if (poke1.myPockes[i].name.equals(p1)) {
							t = i;
						} else if (poke1.myPockes[i].name.equals(p2)) {
							t2 = i;
						}
					}
				}
				Battle poke3 = new Battle();
				String winner = poke3.doBattle(poke1.myPockes[t], poke1.myPockes[t2]);
				System.out.println(winner + "の勝ち！");
			}

			if (x == 99) {
				System.out.println("終了します");
				break;
			}
		}

	}

}
