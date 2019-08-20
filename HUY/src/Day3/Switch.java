package Day3;

import java.util.Scanner;

public class Switch {
	static Employee[] employees = new Employee[1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Job job1 = new Job("HR");
		Job job2 = new Job("BA");
		Job job3 = new Job("Tester");
		Job job4 = new Job("Developer");
		Job job5 = new Job("CEO");

		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("Name: "); Scanner scannerName= new Scanner(System.in);
		 * String name = scannerName.nextLine(); System.out.println("Salary: "); double
		 * salary= input.nextDouble(); System.out.println("Age: "); int
		 * age=input.nextInt(); System.out.println("Job name: "); String
		 * jobname=input.next(); /*Employee NV1 = new Employee(1, "Nguyen Van A", 3000,
		 * job1); Employee NV2 = new Employee(2, "Nguyen Van B", 3000, job2); Employee
		 * NV3 = new Employee(3, "Nguyen Van C", 3000, job3); Employee NV4 = new
		 * Employee(4, "Nguyen Van D", 3000, job4); Employee NV5 = new Employee(5,
		 * "Nguyen Van E", 3000, job5); Employee[] employee = new Employee[5];
		 * employee[0] = NV1; employee[1] = NV2; employee[2] = NV3; employee[3] = NV4;
		 * employee[4] = NV5;
		 */
		int a = 0;
		do {

			// Scanner input = new Scanner(System.in);
			System.out.println("1. creat employee ");
			System.out.println("2. show the existing employee  ");
			System.out.println("3. exit ");
			System.out.print("Vui long chon:");

			a = input.nextInt();

			switch (a) {

			case 1:
				System.out.println("Creat employee");
				System.out.print("Ban can nhap info bao nhieu nhan vien: ");
				int i = input.nextInt();

				for (i = 0; i < 4; i++) {

				}

				break;
			/*
			 * case 2: System.out.println("show the existing employee ");
			 * System.out.print("Ban muon show nhan vien may: "); int e = input.nextInt();
			 * if (e == 1) { System.out.println("Ten nhan vien 1: " + NV1.name);
			 * System.out.println("ID nhan vien 1: " + employee[0].id); } else if (e == 2) {
			 * System.out.println("Ten nhan vien 2: " + employee[1].name);
			 * System.out.println("ID nhan vien 2: " + employee[1].id); }
			 * 
			 * break;
			 */
			case 3:
				// System.out.print("exit");
				break;

			}
		} while (a != 3);
		System.out.print("exit");

	}

	private static void showEmployee() {
		System.out.println("STT    name    salary    jobName");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(
					employees[0].id + " " + employees[0].name + " " + employees[0].salary + " " + employees[0].job);
		}
	}

	private static void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Creat employee");
		System.out.print("Ban can nhap info bao nhieu nhan vien: ");
		int n = scanner.nextInt();
		employees=new Employee[n];
		
		for (int i = 0; i < employees.length; i++) {
		System.out.println("Name: ");
		Scanner scannerName = new Scanner(System.in);
		String name = scannerName.nextLine();
		System.out.println("Salary: ");
		double salary = scanner.nextDouble();
		System.out.println("Age: ");
		int age = scanner.nextInt();
		System.out.println("Job name: ");
		String jobname = scanner.next();

		Employee employee = new Employee(1, name, salary, new Job(jobname));

	}
}}
