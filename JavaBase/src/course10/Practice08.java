package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a>b&&c<a) {
			System.out.println(a+"が１番大きい数値です。");
		}
		if(b>a&&c<b) {
			System.out.println(b+"が１番大きい数値です。");
		}
		if(c>b&&a<c) {
			System.out.println(c+"が１番大きい数値です。");
		}
		if(a>b&&a<c) {
			System.out.println(a+"が２番目大きい数値です。");
		}
		if(b>a&&b<c) {
			System.out.println(b+"が２番目大きい数値です。");
		}
		if(c>b&&c<a) {
			System.out.println(c+"が２番目大きい数値です。");
		}
		if(b>a&&a<c) {
			System.out.println(a+"が３番目大きい数値です。");
		}
		if(a>b&&b<c) {
			System.out.println(b+"が３番目大きい数値です。");
		}
		if(b>c&&c<a) {
			System.out.println(c+"が３番目大きい数値です。");
		}
		
		
		
		
		
		
		
	}

}
