class Manager extends Employee {

	double bonus;

	Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus=bonus;
	}

	@Override
	void displayDetails() {
	System.out.println("Name of the Employee: "+name);
	System.out.println("ID of the Employee: "+id);
	System.out.println("Salary of the Employee: "+salary);
	System.out.println("Bonus of the Employee: "+bonus);
	}
}