/*
 * public abstract class Shape is a superclass to two subclasses, Circle and 
 * Rectangle. It is not a pure abstract class, and performs operations on shapes.
 *
 * public abstract void calcArea(); // Abstract function that should calculate
 * the area of the shape.
 * public String toString() // Overridden to string function prints the area and
 * a distraught message. 
 * public double getArea() // Getter returns mv area.
 * public void setArea(double area) // Setter sets mv area according to parameter.
*/
/**
 *
 * @author Trevor Lastelick
 */
public abstract class Shape {
    
    private double area;    // holds the area of a shape
    
    // Should calculate the area of any shape
    public abstract void calcArea();
    
    /**
     * Reports the shape's area (and a distraught girlfriend shape's thoughts) 
     * @return The shapes area 
     */
    @Override
    public String toString()
    {
        return String.format("Area %.2f\nWhy don't you want to see me anymore??!!?"
                + "Are you saying my areas too large??!", getArea());
    }
    
     /**
     * Returns the mv area
     * @return The value in the member variable area
     */
    public double getArea()
    {
        return this.area;
    }
    
    /**
     * Sets the value of mv area 
     * @param area A double that represents the area of any shape 
     */
    public void setArea(double area)
    {
        this.area = area;
    }
    
} // end Shape class
