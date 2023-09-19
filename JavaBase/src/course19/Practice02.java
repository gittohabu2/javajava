package course19;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//慣れよう問題⑤
		int[] numArray = new int[3];
		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;

		for (int i = 0; i < 3; i++) {
			System.out.println(numArray[i]);
		}
		
		//慣れよう問題⑥
		Scanner stdIn = new Scanner(System.in);
		int[] numArray2 = new int[stdIn.nextInt()];

	}

}
