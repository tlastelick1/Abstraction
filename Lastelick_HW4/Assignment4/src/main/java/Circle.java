/*
 * public class Circle extends Shape and creates a circle object. This circle 
 * object can calculate its own area, and prints a display of it's area and 
 * all of its attributes.
 *
 * public Circle(long centerX, long centerY, double radius) // Only constructor
 * and assigns parameters to cooresponding mv's, and calls overridden calcArea().
 * @override calcArea() // calculates the area of this circle and then calls
 * the inherited function setArea(double value).
 * @override toString() // displays a detailed prompt of the attributes of this class.
 * public long getCenterX() , public long getCenterY() // GETTERS for 
 * corresponding class mv's. 
 * 
 */
/**
 *
 * @author Trevor Lastelick
 */
public class Circle extends Shape {
 
    // I made the variables final because there are no setters within Rectangle
    private final long centerX; // used to hold the x coordinate of the circle's center
    private final long centerY; // used to hold the y coordinate of the circle's center  
    private final double radius; // hold the circle's radius 
      
    /**
     * Accepts values for centerX, centerY, and radius. Also, calls the 
     * overridden calcArea function described below.
     * @param centerX long integer used to hold the x coordinate of the circle's center
     * @param centerY long integer used to hold the y coordinate of the circle's center
     * @param radius double used to hold the circle's radius
     */
    public Circle(long centerX, long centerY, double radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        calcArea();           
    }
    
    /**
     * Calculates the area of the circle and stores the result in the inherited
     * member area.
     */
    @Override
    public void calcArea()
    {
        double area;
        area = 3.4159 * this.radius * this.radius;
        setArea(area);
    }
    
    /**
     * Reports the shape's area and displays the radius, centerX, and centerY.
     * @return A prompt of the features of this circle 
     */
    @Override
    public String toString()
    {
        return String.format("The area of this Circle is: %.2f units\n"
                + "Center X: %d\nCenter Y: %d", getArea(), getCenterX(), 
                getCenterY());
    }
    
    // GETTERS
    public long getCenterX()
    {
        return this.centerX;
    }
    
    public long getCenterY()
    {
        return this.centerY;
    }
    
}
