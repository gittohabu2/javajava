package course54_55;
public class BookControll {
public static void main(String[] args) {
	
	int[] arr = {10,11,12,13,14};
	System.out.println(arr[3]);
	
	Book book1 = new Book("明解Java",1500);
	
	System.out.println(book1.getPrice());
	
	Book book2 = new Book("確かな力が身につくC",2800);
	
	Book book3 = new Book("30時間でマスター",1200);
	
	Book book4 = new Book("ITパスポート試験",2500);
	
	Book[] hondana = new Book[4];
	
	hondana[0] = book1;
}
}