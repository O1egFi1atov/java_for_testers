public class Triangle {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double area(){
        var hp = perimeter() / 2;
        return Math.sqrt(hp * (hp - this.a) * (hp - this.b) * (hp - this.c));
    }
}
