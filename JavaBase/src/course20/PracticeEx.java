package course20;

public class PracticeEx {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] arr = { "x", "y", "x", "y", "x" };

		int mu = 0;
		for (String num : arr) {
			if ("x".equals(num)) {
				mu = mu + 1;
			}
		}
		System.out.println(mu);
	}
}