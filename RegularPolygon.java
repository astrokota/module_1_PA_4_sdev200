public class RegularPolygon {
    
    //data fields are private
    private int n;
    private double side;
    private double x;
    private double y;

    //no-arg constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    //specific number of sides and side length constructor
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    //specific number of sides, side length, and coordinates constructor
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    //get and set methods
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

    //method computes perimeter of polygon
    public double getPerimeter() {
        return n * side;
    }

    //method computes area of polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    //main method for program with test examples
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //diplay perimeter/area for each example
        System.out.println("Polygon 1: ");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println("Polygon 2: ");
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println("Polygon 3: ");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
