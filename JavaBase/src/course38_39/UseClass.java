package course38_39;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//練習問題３
		Pocketon poke1 = new Pocketon();
		
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;
		
		//練習問題４
		String[] arr2 = {"あ","か","さ"};
		for(String num : arr2) {
			System.out.println(num);
		}
		//練習問題６
		Pocketon poke2 = new Pocketon();
		
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 3;
		
		//練習問題１０
		Scanner stdIn = new Scanner(System.in);
		System.out.println("パラメータを入力して");
		Pocketon poke3 = new Pocketon();
		
		String a = stdIn.next();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		poke3.name = a;
		poke3.power = x;
		poke3.difficult = y;
		
		//練習問題５,７
		Pocketon[] myPockes = {poke1,poke2,poke3};
		
		//練習問題８
		System.out.println(myPockes[0].name);
		
		//練習問題９
		System.out.println(myPockes[1].difficult);
		
		//練習問題１１
		System.out.println(myPockes[2].name + "," + myPockes[2].power +"," + myPockes[2].difficult);
		
		//練習問題１２
		for(int i = 0;i < 3; i++) {
			System.out.println(myPockes[i].name);
		}
		//練習問題１３
		myPockes[1].display();
		
		//仮免学科
		Student st = new Student();
		Student st2 = new Student();
		
		st.name = "溝口";
		st.no = 25;
		st2.name = "鹿嶋";
		st2.no = 9;
		
		Student[] myfriend = {st,st2};
		for(int i = 0;i < 2; i++) {
			System.out.println(myfriend[i].name);
		}
	}

}
