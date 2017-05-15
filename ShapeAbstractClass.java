import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
abstract class ShapeAbstractClass { 
	protected double area;
	abstract double findArea();
	
	public static void main(String[] args) throws IOException{
		String menu = "              _______________________________ \n"
                    + "             |                               |\n"
                    + "             |        ***Main Menu***        |\n"
                    + "             |                               |\n"               
                    + "             |  Select a shape from the      |\n"
                    + "             |  options below and enter      |\n"
                    + "             |  its corresponding character  |\n"
                    + "             |                               |\n"                    
                    + "             |  - Circle:     'c'            |\n"
                    + "             |  - Rectangle:  'r'            |\n"
                    + "             |  - Triangle:   't'            |\n"
                    + "             |  - Square:     's'            |\n"
                    + "             |                               |\n"                    
					+ "             |   Note: '**' = Invalid input  |\n"
					+ "             |_______________________________|\n";
					

		
		System.out.println("\nExamples:\n");
		
		/*  Circle subclass execution.
		 */
		Circle circ1 = new Circle(4);
		circ1.area = circ1.findArea();
		System.out.println("A circle of radius " + circ1.radius +
			" has an area of: " + String.format("%.2f",circ1.area));
		
		/*  Rectangle subclass execution.
		 */
		Rectangle rect1 = new Rectangle(2,6);
		rect1.area = rect1.findArea();
		System.out.println("A rectangle of hieght: " +
			rect1.height + " and width: " + rect1.width +
			" has an area of: " + String.format("%.2f",rect1.area));
		
		/*  Triangle subclass execution.
		 */
		Triangle triang1 = new Triangle(4,9);
		triang1.area = triang1.findArea();
		System.out.println("A triangle of height: " +
			triang1.height + " and base: " + triang1.base +
			" has an area of: " + String.format("%.2f",triang1.area));
		
		/*  Square subclass execution
		 */
		Square square1 = new Square(5);
		square1.area = square1.findArea();
		System.out.println("A square of side length: " +
		square1.sideLength + " has an area of: " + String.format("%.2f",square1.area));
		
		String input;
		BufferedReader reader = 
		new BufferedReader(new InputStreamReader(System.in));
		System.out.print(menu + 
			"\n\nRefer to the Main Menu above to select a shape of your own: ");
		System.out.println();
		/*
		 *  Error handling for user input values. 
		 *  Prevents user from crashing the program by hitting enter
		 *  immediately or enetering more than a single isolated 
		 *  character.
		 */
		boolean test = false;
		while (!test){
			input = reader.readLine();
			
			try {
				if (input.charAt(0) == 'c') {
					String givenRad;
					System.out.println("\nYou've selected Circle. Please enter a radius: ");

					boolean test2 = false;
					double adjustedRad = 0;
					while (!test2) {
						try {
							givenRad = reader.readLine();
							adjustedRad = Double.parseDouble(givenRad);
							test2 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					Circle circ2 = new Circle(adjustedRad);
					circ2.area = circ2.findArea();
					System.out.println("\nYour Circle has an area of " +
						String.format("%.2f",circ2.area));
					test = true;
				} else if (input.charAt(0) == 'r') {
					
					String givenHeight;
					System.out.println("\nYou've selected Rectangle. Please enter a height: ");

					boolean test2 = false;
					double adjustedHeight = 0;
					while (!test2) {
						try {
							givenHeight = reader.readLine();
							adjustedHeight = Double.parseDouble(givenHeight);
							test2 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					
					String givenWidth;
					System.out.println("\nPlease enter a width: ");
					
					boolean test3 = false;
					double adjustedWidth = 0;
					while (!test3) {
						try {
							givenWidth = reader.readLine();
							adjustedWidth = Double.parseDouble(givenWidth);
							test3 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					
					Rectangle rect2 = new Rectangle(adjustedHeight, adjustedWidth);
					rect2.area = rect2.findArea();
					System.out.println("\nYour Rectangle has an area of " +
						String.format("%.2f",rect2.area));
					test = true;
				
				} else if (input.charAt(0) == 't') {
					
					String givenHeight;
					System.out.println("\nYou've selected Triangle. Please enter a height: ");

					boolean test2 = false;
					double adjustedHeight = 0;
					while (!test2) {
						try {
							givenHeight = reader.readLine();
							adjustedHeight = Double.parseDouble(givenHeight);
							test2 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					
					String givenBase;
					System.out.println("\nPlease enter a base: ");
					
					boolean test3 = false;
					double adjustedBase = 0;
					while (!test3) {
						try {
							givenBase = reader.readLine();
							adjustedBase = Double.parseDouble(givenBase);
							test3 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					
					Triangle triang2 = new Triangle(adjustedHeight, adjustedBase);
					triang2.area = triang2.findArea();
					System.out.println("\nYour Triangle has an area of " +
						String.format("%.2f",triang2.area));
					test = true;
					
				} else if (input.charAt(0) == 's') {
					
					String givenSideLen;
					System.out.println("\nYou've selected Square. Please enter a side length: ");

					boolean test2 = false;
					double adjustedSideLen = 0;
					while (!test2) {
						try {
							givenSideLen = reader.readLine();
							adjustedSideLen = Double.parseDouble(givenSideLen);
							test2 = true;
						} catch (NumberFormatException NotADecimal) {
							System.out.println("\n**Please enter only a decimal number: ");
						}
					}
					Square square2 = new Square(adjustedSideLen);
					square2.area = square2.findArea();
					System.out.println("\nYour Square has an area of " +
						String.format("%.2f",square2.area));
					test = true;
				} else {
					System.out.println("\n**Plaese enter only one of the " +
                      			       "charcters above, with no spaces: " );
				}
			}
			catch (StringIndexOutOfBoundsException indexNotFound) {
				System.out.println("\n**Plaese enter only one " +
                      			   "of the charcters above, with no spaces: " );
			}
		}
	}
	
	/*
	 *	Constructor used to create shapes with one dimension.
	 *  (circle or square)
	 */
	public ShapeAbstractClass(double dim1) {};
	
	/* 
     *	Constructor used to create shapes with two dimensions.
	 *  (triangle or rectangle)
	 */
	public ShapeAbstractClass(double dim1, double dim2) {};	

}

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



