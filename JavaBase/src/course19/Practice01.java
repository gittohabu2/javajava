package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//慣れよう問題①
		String[] mygroup = new String[3];
		mygroup[0] = "清水";
		mygroup[1] = "嶌田";
		mygroup[2] = "立川";

		//慣れよう問題②
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 12;
		mygroupnum[1] = 11;
		mygroupnum[2] = 16;

		//慣れよう問題③
		int[] myNum = new int[3];
		myNum[0] = 10;
		myNum[1] = 50;
		myNum[2] = myNum[0] + myNum[1];
		
		//慣れよう問題④
		Scanner stdIn = new Scanner(System.in);
		int[] myNumScan = new int[3];
		myNumScan[0] = 10;
		myNumScan[1] = stdIn.nextInt();
		myNumScan[2] = myNumScan[0] + myNumScan[1];
	}
}
