package course12;

import java.util.Scanner;

public class PracticeMuzusugi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    Scanner stdIn = new Scanner(System.in);
	    
	    int x = stdIn.nextInt();
	    int y = stdIn.nextInt();
	    System.out.println("縦"+x+","+"横"+y);
	    
	    while(x<=y) {
	    	System.out.print(x*y+",");
	    	x++;
	    System.out.println();
	    }
	}

}
