package course54_55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		Typhoon t1 = new Typhoon(1,"4月 8日","マラカス");
		
		Typhoon t2 = new Typhoon(2,"4月10日","メーギー");
		
		Typhoon t3 = new Typhoon(3,"6月30日","チャバ");
		
		Typhoon t4 = new Typhoon(4,"7月 1日","アイレー");
		
        Typhoon t5 = new Typhoon(5,"7月28日","ソングダー");
		
		Typhoon t6 = new Typhoon(6,"7月31日","トローセス");
		
		Typhoon t7 = new Typhoon(7,"8月 9日","ムーラン");
		
		Typhoon t8 = new Typhoon(8,"8月12日","メアリー");
		
		Typhoon t9 = new Typhoon(9,"8月22日","マーゴン");
		
		Typhoon[] typhoonList = {t1,t2,t3,t4,t5,t6,t7,t8,t9,null,null,null,null,null,null};
		
		for(int t = 0;t < 9;t++) {
			System.out.println(typhoonList[t].getAsiaName());
		}
		
		int a = stdIn.nextInt();
		
		if(a == 0) {
			for(int t = 0;t < typhoonList.length;t++) {
				System.out.println(typhoonList[t].getAsiaName());
			}
		}else if(a == 99) {
			int b = stdIn.nextInt();
			for(int t = 0;t < typhoonList.length;t++) {
			if(b == typhoonList[t].getTyphoonbango()) {
				
				String c = stdIn.next();
				typhoonList[t].setAsiaName(c);
			}
			}
				for(int i = 0;i < typhoonList.length;i++) {
					System.out.println(typhoonList[i].getAsiaName());
				}
		}
		
		if(a == 55) {
			for(int i = 0;i < typhoonList.length;i++) {
				int x = stdIn.nextInt();
				String y = stdIn.next();
				String z = stdIn.next();
				
				Typhoon t10 = new Typhoon(x,y,z);

				if(typhoonList[i] == null) {
					Typhoon tt = t10;
					typhoonList[i] = tt;
					
				}
			}
			
			for(int i = 0;i < typhoonList.length;i++) {
				System.out.println(typhoonList[i].getAsiaName());
			}
						
		}
	}
}