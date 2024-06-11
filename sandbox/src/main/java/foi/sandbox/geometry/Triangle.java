package foi.sandbox.geometry;

public record Triangle(double a, double b, double c) {

//    свойства класса и конструктор объекта закомментировал, поскольку вместо class применил нотацию record (Лекция 1.9.)
//    private final double a;
//    private final double b;
//    private final double c;
//
//    public ru.filatov.geometry.Triangle(double a, double b, double c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double area(){
        var hp = perimeter() / 2;
        return Math.sqrt(hp * (hp - this.a) * (hp - this.b) * (hp - this.c));
    }
}
