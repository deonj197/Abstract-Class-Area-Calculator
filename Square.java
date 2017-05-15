/*
 *  Square subclass of ShapeAbstractClass.
 */
 class Square extends ShapeAbstractClass {
	 protected double sideLength;
	 public Square(double sideLength) {
		 super(sideLength);
		 this.sideLength = sideLength;
	 }
	 
	 public double findArea() {
		 double squareArea = sideLength*sideLength;
		 return squareArea; 
	 }
	 
 }
