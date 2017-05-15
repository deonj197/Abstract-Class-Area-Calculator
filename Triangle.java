/*
 *  Triangle subclass of ShapeAbstractClass.
 */
class Triangle extends ShapeAbstractClass {
	protected double height;
	protected double base;
	public Triangle(double height, double base) {
		super(height, base);
		this.height = height;
		this.base = base;
	}
	
	public double findArea() {
		double triangArea = 0.5*height*base;
		return triangArea;
	}
}
