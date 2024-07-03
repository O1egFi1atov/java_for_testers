package foi.sandbox.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter(){
        var triangleExample = new Triangle(5.0, 4.0, 3.0);
        double resultTrianglePerimeter = triangleExample.perimeter();
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
