package javaLearning;

// Abstraction lets you focus on what the object does instead of how it does it.

abstract class ShapeClass{
	abstract void draw(); // Abstract method --> Must be overriden in child class else child will become abstract class
	
	// Non-Abstract Class  --> Child class may or may not override non-abstract method
	void greet() {
		System.out.println("Hello from an abstract class");
	}
	
	// Static Method  --> Cannot be overriden
	static void myStaticMethod() {
		System.out.println("Static method of abstract class");
	}
	
	// Final Method  --> Cannot be overriden
	final void noOverride() {
		System.out.println("I can't be overriden");
	}
}

class RectangleClass extends ShapeClass{
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}	
}

class CircleClass extends ShapeClass{
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

public class OOPS_13_AbstractClass {
	public static void main(String[] args) {
		ShapeClass rectangle = new RectangleClass();
		ShapeClass circle = new CircleClass();
		
		ShapeClass.myStaticMethod();
		RectangleClass.myStaticMethod();
		CircleClass.myStaticMethod();
		
		rectangle.draw();
		rectangle.greet();
		rectangle.noOverride();
	
		circle.draw();
		circle.greet();
		circle.noOverride();
	}
}
