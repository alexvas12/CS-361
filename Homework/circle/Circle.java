/**
 * 
 */
package circle;

/**
 * @author Alex Vasilevsky
 *
 */

// TODO Complete the code

public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: " + " centerX = " + ". CenterY = " + ". radius = ";
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==

	//Difference between equals and == is the comparison of the given type. If its a primitive then you should use ==, meanwhile if its an object of some sort then .equals must be used. This is because objects have a reference and by using == you are most likely comparing the references location and not the actual value. As a result, its more important to use .equals as a way to compare the values.
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj)return true;

		Circle someCircle = (Circle)obj;
		return this.centerX == someCircle.centerX && this.centerY == someCircle.centerY && this.radius == someCircle.radius;
	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

	protected Object clone() throws CloneNotSupportedException{
		Circle cloneOfCircle = (Circle)(super.clone());
		cloneOfCircle.centerX = this.centerX;
		cloneOfCircle.centerY = this.centerY;
		cloneOfCircle.radius = this.radius;
		return cloneOfCircle;
	}	
}