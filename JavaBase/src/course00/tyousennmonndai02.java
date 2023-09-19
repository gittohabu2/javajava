package course00;

import java.util.Scanner;

public class tyousennmonndai02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("足し算か引き算か選べ");
		System.out.println("1:足し算 2:引き算 3:乗算 4:除算");

		String a = stdIn.next();

		System.out.println("計算する文字を入力して");
		System.out.println("入力を終了するなら「e」を選択しろ");
		
		
		for(int i = 0;i<100 ;i++) {
			int x = stdIn.nextInt(); 
			int y = stdIn.nextInt(); 
			String b = stdIn.next();
			if(b.equals("e")) {
			}
		if(9999<=x||9999<=y) {
	
		}else {
			int z = stdIn.nextInt();
			String c = stdIn.next();
			if(c.equals("e")) 
	
		if(9999<=z) 
	
		
		
		if (a.equals("1")) {
			tasu(x, y);
		if (a.equals("2"))
			hiku(x, y);
		if (a.equals("3"))
			kake(x, y);
		if (a.equals("4"))
			waru(x, y);
		}}}
	}


	static void tasu(int x, int y) {
		System.out.println(x + y);
	}

	static void hiku(int x, int y) {
		System.out.println(x - y);
	}

	static void kake(int x, int y) {
		System.out.println(x * y);
	}

	static void waru(int x, int y) {
		System.out.println(x / y);
	}

}
