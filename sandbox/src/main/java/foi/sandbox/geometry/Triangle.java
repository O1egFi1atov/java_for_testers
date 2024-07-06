package foi.sandbox.geometry;

// класс Triangle содержит структуру объектов, содержащую информацию о треугольниках
public class Triangle {

    // 1. Описываем структуру объекта.
// описание структуры объекта перечисляет его свойства:
// у объектов этого класса будет три свойства типа число с плавающей точкой, каждое из которых соответствует стороне
// треугольника; также определяем модификатор видимости private):
// подробно в Лекция 1.8. Классы и объекты JAVA17 и Лекция 1.9. Record особый вид классов JAVA17
    private final double sideA;
    private final double sideB;
    private final double sideC;

    // 2. Конструктор объекта (специальная функция, которая инициализирует объекты этого класса)
    // тут мы присваеваем свойствам объекта (то,что выше) конкретные значения (то, что в скобочках), используя ключевое слово this
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // создаем метод вычисления периметра (данные для вычисления периметра мы берем не из параметров функции, а из
    // текущего объекта, поэтому в круглых скобках пусто и нет ключевого слова static)
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    // метод вычисления площади
    public double area() {
        var halfPerimeter = perimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC));
    }

    /* Применяем ветвление (Лекция 2.3 курса JAVA 17), для этого требуется создать конструктор.
    Обрати внимание, поскольку ранее Triangle создан как record, поэтому перед конструктором не указаны свойства объекта (стороны треугольника),
    а у конструктора в параметрах не указаны значения с типами этих значений) */
//    public Triangle {
//        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
//            throw new IllegalArgumentException("Triangle side cannot be negative.");
//        }
//        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
//            throw new IllegalArgumentException("The sum of any two sides must not be less than the third side.");
//        }
//    }
}

    /* Ниже альтернативный способ описания структуры объектов, то есть описания классов. А именно,
пример использования нотации record вместо class, стало доступно в версиях JAVA 14 и новее.
(подробно в Лекция 1.9. курса JAVA 17) */
//
//public record Triangle(double a, double b, double c) {
//    public double perimeter() {
//        return this.sideA + this.sideB + this.sideC;
//    }
//     public double area() {
//        var halfPerimeter = perimeter() / 2;
//        return Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC));
//    }
//    }
// поскольку вместо class применил нотацию record, в которой свойства объекта можно прописать в круглых скобках, то
// отдельно прописывать свойства класса и создавать конструктор объекта не требуется, так как вся информация уже
// заключена в описании класса. В этом преимущество нотации record.