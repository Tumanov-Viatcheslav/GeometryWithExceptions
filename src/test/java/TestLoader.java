import geometry.GeometryLoader;
import geometry.Rectangle;
import org.junit.jupiter.api.*;

import java.util.List;

public class TestLoader {
    @BeforeEach
    public void testStarted() {
        System.out.println("test started");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("test ended\n-------------------------------------------------------------------");
    }

    @Test
    public void testLoader1() {
        Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("input.txt"));
    }
    @Test
    public void testLoader2() {
        Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputCorrect.txt"));
    }
    @Test
    public void testLoader3() {
        List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputIncorrect1.txt"));
        Assertions.assertEquals(0, rectangles.size());
    }
    @Test
    public void testLoader4() {
        List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputIncorrect2.txt"));
        Assertions.assertEquals(2, rectangles.size());
    }
    @Test
    public void testLoader5() {
        List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputIncorrect3.txt"));
        Assertions.assertEquals(2, rectangles.size());
    }
    @Test
    public void testLoader6() {
        List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputIncorrect4.txt"));
        Assertions.assertEquals(1, rectangles.size());
    }
    @Test
    public void testLoader7() {
        List<Rectangle> rectangles = Assertions.assertDoesNotThrow(() -> GeometryLoader.loadListOfRectangles("src/test/resources/inputIncorrect5.txt"));
        Assertions.assertEquals(2, rectangles.size());
    }
}
