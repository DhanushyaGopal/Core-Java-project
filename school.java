package schoolmanagementsystem;
import java.util.List;
public class school {
	private List<Teacher> teachers;
	private List<student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent; 
	public school(List<Teacher> teachers, List<student> students) {
		this.teachers=teachers;
		this.students=students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	public List<Teacher> getTeachers(){
		return teachers;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public List<student> getStudents(){
		return students;
	}
	public void addStudent(student student) {
		students.add(student);
}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+=MoneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent;
	}
}
