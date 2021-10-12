package schoolmanagementsystem;

public class student {
private int id;
private String  name;
private int grade;
private int feesPaid;
private int feesTotal;
public student (int id,String name,int grade) {
	this.feesPaid=0;
	this.feesTotal=30000;
	this.id=id;
	this.name=name;
	this.grade=grade;
}
public void Setgrade(int grade) {
	this.grade=grade;
}
public void payfees(int fees) {
	feesPaid+=fees;
	school.updateTotalMoneyEarned(feesPaid);
}
public int getid() {
	return id;
}
public String getname() {
	return name;
}
public int getgrade() {
	return grade;
}
public int getfeesPaid() {
	return feesPaid;
}
public int getfeesTotal() {
	return feesTotal;
}
public int getRemainingfees() {
	 return feesTotal-feesPaid;
}
@ Override
public String toString() {
	return "student's name:" + name +
			"\nTotal fees paid so far $" + feesPaid;
}
}
