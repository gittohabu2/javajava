package course36;

public class UseClass {
	public static void main(String[] args) {

		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");

		st.display();
		st2.display();
		
		Kaden st3 = new Kaden();
		Kaden st4 = new Kaden();
		st3.name = "家電";
		st4.name = "荷電";
		st3.price = 10000;
		
		st3.display();
		st4.display();
	}
}