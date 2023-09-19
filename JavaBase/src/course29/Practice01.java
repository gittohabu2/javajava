package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		
		Character me =  new Character();
		
		System.out.println("プレイヤー1のパラメータを入力してね");
		
		System.out.println("名前は？");
		me.name = stdIn.next();
		
		System.out.println("HPは？");
		me.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		me.str = stdIn.nextInt();
		
		System.out.println("防御力は？");
		me.def = stdIn.nextInt();
		
		System.out.println("命中率は？");
		me.dex = stdIn.nextInt();
		
		System.out.println("回避率は？");
		me.agi = stdIn.nextInt();
		
		me.viewStatus();
		
		Character tonari =  new Character();
		
		System.out.println("プレイヤー2のパラメータを入力してね");
		
		System.out.println("名前は？");
		tonari.name = stdIn.next();
		
		System.out.println("HPは？");
		tonari.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		tonari.str = stdIn.nextInt();
		
	    System.out.println("防御力は？");
		tonari.def = stdIn.nextInt();
		
		System.out.println("命中率は？");
		tonari.dex = stdIn.nextInt();
		
		System.out.println("回避率は？");
		tonari.agi = stdIn.nextInt();
		
		tonari.viewStatus();
		
		me.battle(me, tonari);
	}

}
