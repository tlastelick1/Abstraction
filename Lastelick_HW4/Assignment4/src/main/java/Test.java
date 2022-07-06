/*
 * This main class tests superclass Shape and it's two subclasses Circle and 
 * Rectangle. It demonstrates polymorphism by creating an array of type Shape, 
 * and assigning the elements of that array a unique Circle or Rectangle class
 * object. It then demonstrates each class's unique toString method in a for
 * statement.
 */

/**
 *
 * @author Trevor Lastelick
 */
public class Test {
    public static void main(String[] args) {
        
        // create an array with the abstract Shape superclass
        Shape[] bigShape = new Shape[4];
        
        // assign each element of the array with a subclass of Shape
        bigShape[0] = new Circle(2, 4, 6);
        bigShape[1] = new Circle(8,10, 18);
        bigShape[2] = new Rectangle(5, 10);
        bigShape[3] = new Rectangle(12, 10);
        
        // For every element in bigShape array, call each object's unique toString method
        for (int i=0; i<4; i++)
        {
            System.out.println(bigShape[i]);
        }
        
        
    }
}
