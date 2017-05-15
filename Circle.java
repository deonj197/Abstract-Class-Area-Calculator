/*
 *  Circle subclass of ShapeAbstractClass.
 */
 
class Circle extends ShapeAbstractClass {
	public double radius;
	public Circle(double radius){
		super(radius);
		this.radius = radius;
		
	}
    public double findArea() {
		double circArea = Math.PI*radius*radius;
		return circArea;
	}
}
