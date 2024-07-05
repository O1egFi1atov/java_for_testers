package foi.sandbox.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        var triangleExample = new Triangle(5.0, 4.0, 3.0);
//        Вариант 1:
//        как один из вариантов реализации проверки: после того, как создан объект типа Triangle (строка выше) и указаны его свойства (стороны),
//        можно создать переменную (строка ниже), в которой будет произведен расчет периметра и потом эту переменную внести в проверку.
//        Можно добавить printline, чтобы увидить результат (и добавить ожидаемый результат), но результат можно посмотреть и в режиме отладки (дебаг).
//        Вариант 2 мне нравится больше, он в тесте ниже.
        double resultTrianglePerimeter = triangleExample.perimeter();
//        System.out.println(resultTrianglePerimeter);
        Assertions.assertEquals(12.0, resultTrianglePerimeter);
    }

    @Test
    void canCalculateArea() {
        var triangleExample = new Triangle(5.0, 4.0, 3.0);
//        Вариант 2:
//        в этом варианте реализации мы не создаем переменную, а в параметры проверки вносим сам метод вычисления площади,
//        за счет этого сразу становится понятно какое вычисление производится (не нужно смотреть что вложено в переменную),
//        и число строк кода сокращается. (подробнее Урок 1.7. JAVA17)
        Assertions.assertEquals(6.0, triangleExample.area());
    }

    @Test
    void triangleSideCannotBeNegative() {

    }
}
