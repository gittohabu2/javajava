package course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Product pro1 = new Product();
		
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;
		pro1.display();
		
		Food food = new Food();
		food.name = "牛";
		food.price = 100;
		
		Food[] menu = new Food[4];
		Food food1 = new Food();
		Food food2 = new Food();
		Food food3 = new Food();
		Food food4 = new Food();
		
		food1.name = "鳥";
		food1.price = 20;
		food2.name = "鳥";
		food2.price = 20;
		food3.name = "鳥";
		food3.price = 20;
		food4.name = "鳥";
		food4.price = 20;
		
		
	}

}
