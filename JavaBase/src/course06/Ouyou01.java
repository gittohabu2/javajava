package course06;

import java.util.Scanner;

public class Ouyou01 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();
        
		if(x >= 10) {
		System.out.println("10以上");
		}else {
			System.out.println("小さい");
		}

		
	}
}