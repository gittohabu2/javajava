package course19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a = "嶌田";
		String b = "立川";
		String c = "清水";
		String d = "溝口";

		String e = "大関";
		String f = "長縄";
		String g = "杉本";
		String h = "藤倉";

		//配列の鉄板構文
		//[]のことを要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "嶌田";
		nameList[1] = "立川";
		nameList[2] = "清水";
		nameList[3] = "溝口";
		nameList[4] = "大関";
		nameList[5] = "長縄";
		nameList[6] = "杉本";
		nameList[7] = "藤倉";

		for (int i = 0; i < 8; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}
	}
}
