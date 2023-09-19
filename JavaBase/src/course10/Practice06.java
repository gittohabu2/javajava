package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		String z = "xがでかい！なぜならxは";
		String z2 = "でyは";
		String z3 = "でxは";
		String z4 = "だから";
		String zz = z+x+z2+y+z4;
		String zzz = z+y+z3+x+z4;
		
		if(x>y) {
			System.out.println(zz);
		}
		if(y>x) {
			System.out.println(zzz);
		}
		if(x==y) {
			System.out.println("おなじー");
		}
		
	}

}
