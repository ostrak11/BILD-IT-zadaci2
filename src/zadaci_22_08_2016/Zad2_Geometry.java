package zadaci_22_08_2016;

/* In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). 
 * Design a class named RegularPolygon that contains:
 ■ A private int data field named n that defines the number of sides in the polygon with default value 3. 
 ■ A private double data field named side that stores the length of the side with default value 1. 
 ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
 ■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0. 
 ■ A no-arg constructor that creates a regular polygon with default values.
 ■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0). 
 ■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates. 
 ■ The accessor and mutator methods for all data fields. 
 ■ The method getPerimeter() that returns the perimeter of the polygon. 
 ■ The method getArea() that returns the area of the polygon. The formula for 
computing the area of a regular polygon is Area =
			n * s2 /4 * tan¢p n≤. 

Draw the UML diagram for the class and then implement the class. Write a test program that creates three RegularPolygon objects, created using the no-arg constructor, 
using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
*/

public class Zad2_Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kreiranje objekarta sa svojstvima
		RegularPolygon poly0 = new RegularPolygon();
		RegularPolygon poly1 = new RegularPolygon(6,4);
		RegularPolygon poly2 = new RegularPolygon(10, 4 ,5.6, 7.8);
		
		
		//ispis rezultata
		System.out.println("Perimeter for object polyO is " +poly0.getPerimeter()+ " and area is: "+ poly0.getArea());
		System.out.println("Perimeter for object poly1 is " +poly1.getPerimeter()+ " and area is: "+ poly1.getArea());
		System.out.println("Perimeter for object poly2 is " +poly2.getPerimeter()+ " and area is: "+ poly2.getArea());
	}

}

class RegularPolygon{
	
	//varijable
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	
	//konstruktori za kreiranje objekata, sa određenim varijablama
	RegularPolygon(){
		n=3;
		side=1;
		x=0;
		y=0;		
	}
	
	RegularPolygon(int n,double side){
		this.n=n;
		this.side=side;
		x=0;
		y=0;
	}
	
	RegularPolygon(int n,double side,double x, double y){
		this.n=n;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	
	//getter i setter metode
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//metoda za obim
	double getPerimeter(){
		return side*n;
	}
	
	//metoda za povrsinu
	double getArea(){
		return (n*side*side)/(4*(Math.tan(Math.PI/n)));
	}
}