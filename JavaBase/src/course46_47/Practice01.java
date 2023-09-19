package course46_47;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			//練習問題①
			int[] array = { 1, 2, 3 };
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}

			//練習問題②
			int number = 5;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
			
			//練習問題③
			int number2 = 5;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
			
			//練習問題④
		    int result = divideNumbers(10, 10);
		    System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！！！");
			System.out.println(e);
			e.printStackTrace();
		}
	}
	///////これはmainメソッドの外に書いて////////
	public static int divideNumbers(int a, int b) {
		return a / b;
	}

}
