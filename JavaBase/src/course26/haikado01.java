package course26;

import java.util.Scanner;

public class haikado01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		//所持金表示メソッド
		int a = 1000;
		shozi(a);
	
	    //勝敗判定メソッド
	    //②=x,③=y
		int x = 1;
		int y = 2;
		int z = 1;
		String a3 = yoso(x, y, z);
		
		
		//敗北数を記録する変数
		int losecount = 0;
		
		//ゲームの終了判定メソッド
		System.out.println("continue?");
		int xxx = stdIn.nextInt();
		String a4 = syuryo(xxx);
	
	}
	
	static void shozi(int a) {
		System.out.println("現在の所持金は"+a+"です。");
	}
	
	static String yoso(int x,int y,int z) {
		String a2 = "";
		if(x>y&&z==1||x<y&&z==1) {
			a2 = "LOSE";
		}
		if(x>y&&z==2||x<y&&z==2) {
			a2 = "WIN";
		}
		return a2;}
		
	static String syuryo(int x) {
		String aa = "";{
		if(x==9999) {
			aa = "END";
		}else {
			aa = "CONT";
		}
		return aa;
		}
		}
	}
	

