/*
 * public class Rectangle extends Shape and creates and displays it's specific
 * attributes and area.
 * public Rectangle (long width, long length) // Only constructor that sets
 * attributes to corresponding parameters, and calculates the area of a rectangle
 * and stores that area in its inherited mv area via calcArea().
 * override public void calcArea() calculates the area of a rectangle and sets 
 * the inherited mv area.
 * override public String toStrin() // Displays the calculated area and attributes 
 * of this class. 
 * public long getWidth() , public long getLength() // GETTERS get this class's
 * corresponding mv's.
 
*/

/**
 *
 * @author Trevor Lastelick
 */

public class Rectangle extends Shape {
    
    // I made the variables final because there are no setters within Rectangle
    
    private final long width; // hold the width of the rectangle
    private final long length; // hold the length of the rectangle
    
    public Rectangle (long width, long length)
    {
        this.width = width;
        this.length = length;
        calcArea();
    }
    
    /**
     * calculates the area of the rectangle (area = length * width) and
     * stores the result in the inherited member area.
     */
    @Override
    public void calcArea()
    {
        double area;
        area = this.length * this.width;
        setArea(area);
    }
    
    /**
     * Reports the shape's area and displays the length and width.
     * @return A display of this rectangles area and attributes.
     */
    @Override
    public String toString()
    {
        return String.format("The area of this Rectangle is: %.2f units\n"
                + "Width: %d\nLength: %d", getArea(), getWidth(), 
                getLength());
    }
    
    // GETTERS
    public long getWidth()
    {
        return this.width;
    }
    
    public long getLength()
    {
        return this.length;
    }
    
} // end Rectangle class 
  
