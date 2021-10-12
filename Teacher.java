package schoolmanagementsystem;

public class Teacher {
private int id;
private String name;
private int salary;
private int salaryEarned;
public Teacher(int id,String name,int salary) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.salaryEarned=0;
}
public int getid() {
	return id;
}
public String getname() {
	return name;
}
public int getsalary() {
	return salary;
}
public void getsalary(int salary) {
	this.salary=salary;
}
public void receivesalary(int salary) {
	salaryEarned+=salary;
	school.updateTotalMoneySpent(salary);
}
@Override
public String toString() {
	return "Name of the Teacher:" + name+"\nTotal salary earned so far $" + salaryEarned;
}
}
