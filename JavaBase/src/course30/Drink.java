package course30;

public class Drink {

	int price;
	String name;
	
	void display() {
		System.out.println(price);
		System.out.println(name);
	
	}
	int calcSum(int price,int suryo) {
		int sum = price * suryo;
		return sum;
	}
	
	Drink(int p, String n){
		price = p;
		name = n;
	}

}
