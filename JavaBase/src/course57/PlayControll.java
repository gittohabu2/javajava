package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);
		int p = rnd.nextInt(5) + 1;
		int p2 = rnd.nextInt(5) + 1;
		int p3 = rnd.nextInt(5) + 1;
		int p4 = rnd.nextInt(5) + 1;
		int t = rnd.nextInt(11) + 3;
		int t2 = rnd.nextInt(11) + 3;
		int t3 = rnd.nextInt(11) + 3;
		int t4 = rnd.nextInt(11) + 3;
		int tore = 0;

		Player me = new Player();

		me.setGakuryoku(p);
		me.setKinryoku(p2);
		me.setMitame(p3);
		me.setOmosiro(p4);

		Target koku = new Target();

		koku.setHituyouGaku(t);
		koku.setHituyouKin(t2);
		koku.setHituyouMita(t3);
		koku.setHituyouOmo(t4);

		System.out.println("モードを選択してね！");
		System.out.println("0.通常モード 99.デバッグモード");
		int ex = stdIn.nextInt();
		if (ex == 0) {
			for (int count = 0; count < 7; count++) {
				System.out.println("現在のあなたのパラメータはコレ↓です");
				System.out.println("筋力 " + me.getKinryoku());
				System.out.println("学力 " + me.getGakuryoku());
				System.out.println("顔面偏差値 " + me.getMitame());
				System.out.println("面白さ " + me.getOmosiro());

				System.out.println("どのトレーニングをしますか？");
				System.out.println("1.筋トレ 2.勉強 3.整形 4.人と喋る");
				int a = stdIn.nextInt();

				if (a == 1) {
					me.setKinryoku(me.getKinryoku() + 1);
				}
				if (a == 2) {
					me.setGakuryoku(me.getGakuryoku() + 1);
				}
				if (a == 3) {
					me.setMitame(me.getMitame() + 1);
				}
				if (a == 4) {
					me.setOmosiro(me.getOmosiro() + 1);
				}

				int kp = rnd.nextInt(4) + 1;
				if (kp == 1) {
					System.out.println("あの子の理想の筋力は…");
					System.out.println(koku.getHituyouKin());
				}
				if (kp == 2) {
					System.out.println("あの子の理想の学力は…");
					System.out.println(koku.getHituyouGaku());
				}
				if (kp == 3) {
					System.out.println("あの子の理想の顔面偏差値は…");
					System.out.println(koku.getHituyouMita());
				}
				if (kp == 4) {
					System.out.println("あの子の理想の面白さは…");
					System.out.println(koku.getHituyouOmo());
				}

			}

			System.out.println("現在のあなたのパラメータはコレ↓です");
			System.out.println("筋力 " + me.getKinryoku());
			System.out.println("学力 " + me.getGakuryoku());
			System.out.println("顔面偏差値 " + me.getMitame());
			System.out.println("面白さ " + me.getOmosiro());

		}

		if (ex == 99) {
			while (true) {
				System.out.println("自分の理想のパラメータを入力してね");
				System.out.println("筋力→学力→顔面偏差値→面白さ");
				int k = stdIn.nextInt();
				int g = stdIn.nextInt();
				int h = stdIn.nextInt();
				int o = stdIn.nextInt();

				me.setKinryoku(k);
				me.setGakuryoku(g);
				me.setMitame(h);
				me.setOmosiro(o);

				System.out.println("現在のあなたのパラメータはコレ↓です");
				System.out.println("筋力 " + me.getKinryoku());
				System.out.println("学力 " + me.getGakuryoku());
				System.out.println("顔面偏差値 " + me.getMitame());
				System.out.println("面白さ " + me.getOmosiro());

				System.out.println("これで確定しますか？");
				System.out.println("1.はい 2.いいえ");
				int s = stdIn.nextInt();

				if (s == 1) {
					break;
				}
			}

			while (true) {
				System.out.println("あの子の好みのパラメータを入力してね");
				System.out.println("筋力→学力→顔面偏差値→面白さ");
				int k2 = stdIn.nextInt();
				int g2 = stdIn.nextInt();
				int h2 = stdIn.nextInt();
				int o2 = stdIn.nextInt();

				koku.setHituyouKin(k2);
				koku.setHituyouGaku(g2);
				koku.setHituyouMita(h2);
				koku.setHituyouOmo(o2);

				System.out.println("現在のあの子の好みのパラメータはコレ↓です");
				System.out.println("筋力 " + koku.getHituyouKin());
				System.out.println("学力 " + koku.getHituyouGaku());
				System.out.println("顔面偏差値 " + koku.getHituyouMita());
				System.out.println("面白さ " + koku.getHituyouOmo());

				System.out.println("これで確定しますか？");
				System.out.println("1.はい 2.いいえ");
				int s2 = stdIn.nextInt();

				if (s2 == 1) {
					break;
				}
			}
		}

		System.out.println("時は満ちた…");
		System.out.println("どの能力で勝負しますか？");
		System.out.println("1.筋力 2.学力 3.顔 4.面白さ");
		int pr = stdIn.nextInt();
		int pr2 = rnd.nextInt(4) + 1;

		if (pr == 1) {
			if (me.getKinryoku() > koku.getHituyouKin()) {
				if (pr2 == 1) {
					if (me.getKinryoku() > koku.getHituyouKin()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("筋力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 2) {
					if (me.getGakuryoku() > koku.getHituyouGaku()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("学力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 3) {
					if (me.getMitame() > koku.getHituyouMita()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("顔で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 4) {
					if (me.getOmosiro() > koku.getHituyouOmo()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("面白さで振られた！");
						System.out.println("残念！死亡！！");
					}
				}
			} else {
				System.out.println("「ごめんなさい！」");
				System.out.println("残念！死亡！！");
			}
		}

		if (pr == 2) {
			if (me.getGakuryoku() > koku.getHituyouGaku()) {
				if (pr2 == 1) {
					if (me.getKinryoku() > koku.getHituyouKin()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("筋力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 2) {
					if (me.getGakuryoku() > koku.getHituyouGaku()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("学力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 3) {
					if (me.getMitame() > koku.getHituyouMita()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("顔で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 4) {
					if (me.getOmosiro() > koku.getHituyouOmo()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("面白さで振られた！");
						System.out.println("残念！死亡！！");
					}
				}
			} else {
				System.out.println("「ごめんなさい！」");
				System.out.println("残念！死亡！！");
			}
		}

		if (pr == 3) {
			if (me.getMitame() > koku.getHituyouMita()) {
				if (pr2 == 1) {
					if (me.getKinryoku() > koku.getHituyouKin()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("筋力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 2) {
					if (me.getGakuryoku() > koku.getHituyouGaku()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("学力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 3) {
					if (me.getMitame() > koku.getHituyouMita()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("顔で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 4) {
					if (me.getOmosiro() > koku.getHituyouOmo()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("面白さで振られた！");
						System.out.println("残念！死亡！！");
					}
				}
			} else {
				System.out.println("「ごめんなさい！」");
				System.out.println("残念！死亡！！");
			}
		}

		if (pr == 4) {
			if (me.getOmosiro() > koku.getHituyouOmo()) {
				if (pr2 == 1) {
					if (me.getKinryoku() > koku.getHituyouKin()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("筋力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 2) {
					if (me.getGakuryoku() > koku.getHituyouGaku()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("学力で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 3) {
					if (me.getMitame() > koku.getHituyouMita()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("顔で振られた！");
						System.out.println("残念！死亡！！");
					}
				}
				if (pr2 == 4) {
					if (me.getOmosiro() > koku.getHituyouOmo()) {
						System.out.println("「よろしくお願いします！」");
						System.out.println("告白成功！");
					} else {
						System.out.println("「ごめんなさい！」");
						System.out.println("面白さで振られた！");
						System.out.println("残念！死亡！！");
					}
				}
			} else {
				System.out.println("「ごめんなさい！」");
				System.out.println("残念！死亡！！");
			}
		}

	}
}
