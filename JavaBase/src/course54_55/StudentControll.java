package course54_55;

public class StudentControll {
	public static void main(String[] args) {

		Student tonari = new Student(21,"根本晴");
		
        Student me = new Student(25,"溝口真矢");
		
		Student[] mymen = {tonari,me};
		
		mymen[1].setName("jdncib");
		System.out.println(mymen[0].getName());
		
	}
}