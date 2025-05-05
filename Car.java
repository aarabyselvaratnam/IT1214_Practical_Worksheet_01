class Car extends Vehicle{
	String model;

	@Override
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
		System.out.println("Model: "+model);
	}
}