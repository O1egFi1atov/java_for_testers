package foi.sandbox.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter(){
        var triangleExample = new Triangle(5.0, 4.0, 3.0);
        double resultTrianglePerimeter = triangleExample.perimeter(); /* можно было и не создавать эту переменную result, а в параметрах функции assertEquals сразу использовать сам метод. Решил создать переменную, так как лично мне проще так читать код (Урок 1.7. JAVA17) */
//        System.out.println(resultTrianglePerimeter);
        Assertions.assertEquals(12.0, resultTrianglePerimeter);
    }

    @Test
    void canCalculateArea(){
        var triangleExample = new Triangle(5.0, 4.0, 3.0);
        double resultTriangleArea = triangleExample.area();
//        System.out.println(resultTriangleArea);
        Assertions.assertEquals(6.0,resultTriangleArea);
    }

    @Test
    void triangleSideCannotBeNegative(){

    }
}
