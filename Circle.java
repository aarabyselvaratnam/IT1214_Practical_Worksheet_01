class Circle extends Shape {
	double radius;

	Circle(double radius) {

	this.radius = radius;

	}

	@Override
	void area() {
		System.out.println("Area of the circle is: "+3.14*radius*radius);
	}
}