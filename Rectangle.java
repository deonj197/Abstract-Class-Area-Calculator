/*
 *  Rectangle subclass of ShapeAbstractClass.
 */
class Rectangle extends ShapeAbstractClass {
	protected double height;
	protected double width;
	public Rectangle(double height, double width) {
		super(height,width);
		this.height = height;
		this.width = width;
	}
	
	public double findArea() {
		double rectArea = height*width;
		return rectArea;
	}
}
