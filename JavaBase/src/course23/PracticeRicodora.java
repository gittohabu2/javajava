package course23;

import java.util.Scanner;

public class PracticeRicodora {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("りこドラ！！");
		System.out.println("現在のパネル↓");
		
		String[][] dora = {{"☆","□","☆"},{"□","☆","△"},{"△","□","△"}};
		String save ="0";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dora[i][j]);
			}
			System.out.println();
		}
				
		System.out.println("入れ替え位置を入力してね。[?](縦)[](横)");
		int x=stdIn.nextInt();
		System.out.println("入れ替え位置を入力してね。[](縦)[?](横)");
		int z=stdIn.nextInt();
		System.out.println("入れ替え位置を入力してね。[?](縦)[](横)");
		int i2=stdIn.nextInt();
		System.out.println("入れ替え位置を入力してね。[](縦)[?](横)");
		int j2=stdIn.nextInt();
		
		save=dora[x][z];
		dora[x][z]=dora[i2][j2];
		dora[i2][j2]=save;
		if(dora[x][z].equals(dora[x][z+1])&&dora[x][z].equals(dora[x][z-1])) {
			dora[x][z]="G";
			dora[x][z+1]="G";
			dora[x][z-1]="G";
		}else if(dora[x][z].equals(dora[x][z+1])&&dora[x][z].equals(dora[x][z-1])) {
			dora[x][z]="G";
			dora[x][z+1]="G";
			dora[x][z-1]="G";
		}else if(dora[x][z].equals(dora[x][z+1])&&dora[x][z].equals(dora[x][z-1])) {
			dora[x][z]="G";
			dora[x][z+1]="G";
			dora[x][z-1]="G";
		}
		
		
		
		
		System.out.println("入れ替えました！");
		
System.out.println("現在のパネル↓");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(dora[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		}
	}


