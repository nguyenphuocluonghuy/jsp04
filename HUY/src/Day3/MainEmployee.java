package Day3;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Job job1= new Job("HR");
		Job job2= new Job("BA");
		Job job3= new Job("Tester");
		Job job4= new Job("Developer");
		Job job5= new Job("CEO");
Employee NV1=new Employee(1,"Nguyen Van A", 3000, job1);
Employee NV2=new Employee(2,"Nguyen Van B", 3000, job2);
Employee NV3=new Employee(3,"Nguyen Van C", 3000, job3);
Employee NV4=new Employee(4,"Nguyen Van D", 3000, job4);
Employee NV5=new Employee(5,"Nguyen Van E", 3000, job5);

//System.out.println("Nhan Vien 1: ");
System.out.println("ID: "+NV1.id);
System.out.println("Name: "+NV1.name);
System.out.println("Salary: "+NV1.salary);
System.out.println("Job name: "+job1.name);

//System.out.println("Nhan Vien 2: ");
System.out.println("ID: "+NV2.id);
System.out.println("Name: "+NV2.name);
System.out.println("Salary: "+NV2.salary);
System.out.println("Job name: "+job2.name);
	
	Employee[] employeeArray  = new Employee[5];
	employeeArray[0]= NV1;
	employeeArray[1]= NV2;
	employeeArray[2]= NV3;
	employeeArray[3]= NV4;
	employeeArray[4]= NV5;
	
	   System.out.println( "Last NV: ");
	   System.out.println( "Name NV: "+ employeeArray[4].name);
	   System.out.println( "ID NV: "+ employeeArray[4].id);
System.out.print("Nhap vao 1 so: ");
	   Scanner input = new Scanner(System.in);
	   int number = input.nextInt();
	   System.out.print("Ban vua nhap: "+ number);*/
		Scanner input =new Scanner(System.in);
		
		System.out.print("Nhap ID: ");
		int id =input.nextInt();
		
		System.out.print("Nhap name: ");
		String name =input.next();
		
		System.out.print("Nhap luong: ");
		double salary= input.nextDouble();
		
		System.out.print("Nhap ten cong viec: ");
		String job=input.next();
		
		//System.out.printf("ID ","Name ","Salary ","Name job ");
		System.out.printf("%-12s%-12s%-12s%s\n","ID","Name","Salary","Name job");
        System.out.printf("%-12s%-12s%-12s%s\n", id, name, salary, job);
		/*System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Name job: "+job);*/
	}
}
