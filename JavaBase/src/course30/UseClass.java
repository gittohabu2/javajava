package course30;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Drink drink = new Drink(100, "初期データ");
		drink.display();
		

		drink.price = 150;
		drink.name = "午後の紅茶";

		drink.display();

		int sum = drink.calcSum(150, 150);
		System.out.println("合計は" + sum);
		}
	}

