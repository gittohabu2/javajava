package course45;

public class MobPro {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numExArr = {10,50,30,20,40};
		
		int savepoint = numExArr[0];
		numExArr[0] = numExArr[4];
		numExArr[4] = savepoint;
		
		int savepoint2 = numExArr[1];
		numExArr[1] = numExArr[3];
		numExArr[3] = savepoint2;
		
		System.out.println(numExArr[0]);
		System.out.println(numExArr[1]);
		System.out.println(numExArr[3]);
		System.out.println(numExArr[4]);
	}

}
