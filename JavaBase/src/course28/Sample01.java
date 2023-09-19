package course28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";

		hu1.hp = 50;
		hu1.neru();

		System.out.println(hu1.name);

	//Chrクラスのインスタンス「numata」を生成。
	//attack def spd love mp hpに好きなパラメータを設定してみよう。
	Chr numata = new Chr();
	numata.attack = 10;
	numata.def = 450;
	numata.spd = 10;
	numata.love = 10;
	numata.hp = 10;
	numata.mp = 10;
	

	//Chrクラスのインタンス「kajima」を生成
	//パラメータを設定してみよう。
	Chr kajima = new Chr();
	kajima.attack = 950;
	kajima.def = 10;
	kajima.spd = 10;
	kajima.love = 10;
	kajima.hp = 10;
	kajima.mp = 10;
	kajima.naguru(kajima.attack, numata.def);

	}


}