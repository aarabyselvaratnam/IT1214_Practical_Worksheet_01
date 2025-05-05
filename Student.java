class Student{

	private String name;
	private int regNo;
	private String course;

Student(String name, int regNo, String course){
		this.name=name;
		this.regNo=regNo;
		this.course=course;
	}

public String getName(){
		return name;
	}

public void setName(String name){
		this.name=name;
	}

public int getRegNo(){
		return regNo;
	}

public void setRegNo(int regNo){
		this.regNo=regNo;
	}

public String getCourse(){
		return course;
	}

public void setCourse(String course){
		this.course=course; 
	}

public void display(){
	System.out.println("Name: "+name);
	System.out.println("Reg No: "+regNo);
	System.out.println("Course: "+course);
	}
}