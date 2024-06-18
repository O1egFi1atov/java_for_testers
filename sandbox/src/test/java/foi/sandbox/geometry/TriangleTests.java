package foi.sandbox.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter(){
        var p = new Triangle(5.0, 4.0, 3.0);
        double result = p.perimeter();
//        System.out.println(result);
        Assertions.assertEquals(12.0, result);
    }

    @Test
    void canCalculateArea(){
        var s = new Triangle(5.0, 4.0, 3.0);
        double result = s.area();
//        System.out.println(result);
        Assertions.assertEquals(6.0,result);
    }

    @Test
    void triangleSideCannotBeNegative(){

    }
}
