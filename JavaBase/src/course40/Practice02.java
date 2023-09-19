package course40;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int num : numbers) {
			System.out.println(num);
		}

		String[] cities = { "東京", "大阪", "千葉", "神奈川", "埼玉笑" };
		for (String num2 : cities) {
			System.out.println(num2);
		}

		int[] numbers2 = { 10, 20, 30, 40, 50 };
		int x = 0;
		for (int i = 0; i < numbers2.length; i++) {
			if (x < numbers2[i]) {
				x = numbers2[i];
			}
		}
		System.out.println(x);

		int[] numbers3 = { 11, 20, 31, 40, 51 };
		for (int i = 0; i < numbers3.length; i++) {
			if (numbers3[i] % 2 == 1) {
				System.out.println(numbers3[i]);
			}
		}

	}
}
