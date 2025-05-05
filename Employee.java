class Employee{
	String name;
	int id;
	double salary;

Employee(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

void displayDetails(){
	System.out.println("Name of the Employee: "+name);
	System.out.println("ID of the Employee: "+id);
	System.out.println("Salary of the Employee: "+salary);
	}
}