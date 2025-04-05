class Rectangle {
 public double length;
 public double breadth;
 
 public double area(){
    return length*breadth;
 }

 public double perimeter(){
    return 2*(length+breadth);
 }

}
public class RectangleTest{
    public static void main (String args []){
        Rectangle rectangle = new Rectangle();
        rectangle.length=10;
        rectangle.breadth=5;
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
