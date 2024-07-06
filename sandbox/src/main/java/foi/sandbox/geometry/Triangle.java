package foi.sandbox.geometry;

public class Triangle {

//    описываем структуру класса (Лекция 1.8. Классы и объекты JAVA17):

    // свойства класса (у объектов этого класса будет три значения типа число с плавающей точкой,
    // каждое из которых будет определять сторону треугольника; также определяем модификатор видимости private):
    private final double sideA;
    private final double sideB;
    private final double sideC;

    // конструктор объекта (специальная функция, которая инициализирует объекты этого класса)
    // тут мы присваеваем свойствам объекта (то,что выше) конкретные значения (то, что в скобочках), используя ключевое слово this
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // метод вычисления периметра (данные для вычисления периметра мы берем не из параметров функции, а из
    // текущего объекта, поэтому в круглых скобках пусто нет ключевого слова static)
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    // метод вычисления площади
    public double area() {
        var halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC));
    }
}

/* Ниже код, решающий ту же самую задачу, но более современным способом, а именно пример использования нотации record вместо class, стало доступно в версиях JAVA 17 и новее */
//public record Triangle(double a, double b, double c) {
//    свойства класса и конструктор объекта ниже закомментировал, поскольку вместо class применил нотацию record (Лекция 1.9. курса JAVA 17)
//
/* свойства класса: */
//    private final double a;
//    private final double b;
//    private final double c;
//
/* конструктор объекта: */
//    public Triangle(double a, double b, double c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

/* Применил ветвление (Лекция 2.3 курса JAVA 17), для этого требуется создать конструктор.
Обрати внимание, поскольку ранее Triangle создан как record, поэтому перед конструктором не указаны свойства объекта (стороны треугольника),
а у конструктора в параметрах не указаны значения с типами этих значений) */
//    public Triangle {
//        if (a <= 0 || b <= 0 || c <= 0) {
//            throw new IllegalArgumentException("Triangle side cannot be negative.");
//        }
//        if (a + b <= c || a + c <= b || b + c <= a) {
//            throw new IllegalArgumentException("The sum of any two sides must not be less than the third side.");
//        }
//    }
//
//    // метод вычисления периметра
//    public double perimeter() {
//        return this.a + this.b + this.c;
//    }
//
//    // метод вычисления площади
//    public double area() {
//        var hp = perimeter() / 2;
//        return Math.sqrt(hp * (hp - this.a) * (hp - this.b) * (hp - this.c));
//    }
//
//}
