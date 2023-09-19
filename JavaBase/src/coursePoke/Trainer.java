package coursePoke;

import java.util.Random;

public class Trainer {

	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];
	}

	void capture(Pocketon pocke) {
		Random rand = new Random();
		for (int i = 0; i <= 6; i++) {
			int a = rand.nextInt(10) + 1;
			if (myPockes[i] == null) {
				if (a > pocke.difficult) {
					System.out.println("捕獲成功！");
					myPockes[i] = pocke;
					break;
				} else {
					System.out.println("捕獲失敗…。");
					break;
				}
			}
		}
	}

	void display() {
		for (int i = 0; i < myPockes.length; i++) {
			if (myPockes[i] == null) {
				System.out.println("中身が無いよ");
			} else {
				System.out.println(myPockes[i].name);
			}
		}
	}
}
