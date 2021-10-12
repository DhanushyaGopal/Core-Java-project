package schoolmanagementsystem;
import java.util.ArrayList;
import java.util.List;

  
 
public class main {

	public static void main(String[] args )
	{
		Teacher Adam  =  new Teacher( 1,"Adam",5000);
		Teacher Lizzy  = new Teacher(2,"Lizzy",7000);  
		Teacher Surya  = new Teacher(3,"Surya",9000);
		 
		 
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Adam);
		teacherList.add(Lizzy);
		teacherList.add(Surya);
		 
		  student Deena = new student(1,"Deena",7);
		  student Zoya = new student(2,"Zoya",9);
		  student Arya = new student(3,"Arya",11);
	List<student> studentList = new ArrayList<>();
	studentList.add(Deena);
	studentList.add(Zoya); 
	studentList.add(Arya);
	 
	 
	school Sunschool= new school(teacherList,studentList);
	
	Deena.payfees(15000);
	Arya.payfees(6000);
	Zoya.payfees(7000);	
	System.out.println("Sunschool  has earned $"  + Sunschool.getTotalMoneyEarned());
	System.out.println("----Making Sunschool pay salary----");
	System.out.println("Amount spended for other expenses:1000");
	Adam.receivesalary(Adam.getsalary());
	Lizzy.receivesalary(Lizzy.getsalary());
	Surya.receivesalary(Surya.getsalary());
	
	System.out.println("Sunschool has spent for salary to" 
	+ "\nand now has $"
			+ Sunschool.getTotalMoneyEarned());
	System.out.println(Deena);
	System.out.println(Arya);
	System.out.println(Zoya);
	System.out.println(Adam);
	System.out.println(Lizzy);
	System.out.println(Surya);
	}
	}
	
	 