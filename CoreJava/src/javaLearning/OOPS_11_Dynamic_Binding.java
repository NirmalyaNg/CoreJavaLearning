package javaLearning;

class Shape{
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

// call to an overridden method is resolved at run time, -> Dynamic Method Dispatch
 
public class OOPS_11_Dynamic_Binding {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw(); // Static Binding
		
		Circle circle = new Circle();
		circle.draw(); // Static Binding
		
		Rectangle rectangle = new Rectangle(); 
		rectangle.draw(); // Static binding
		
		Shape shape2 = new Circle(); // Upcasting 
		shape2.draw();  // Dynamic Method Dispatch
	}
}
