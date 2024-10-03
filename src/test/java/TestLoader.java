import geometry.GeometryException;
import geometry.GeometryLoader;
import geometry.Rectangle;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
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

    @Test
    public void testLoader8() {
        List<Rectangle> rectangles = GeometryLoader.loadListOfRectangles("src/test/resources/inputCorrect.txt");
        List<Rectangle> rectanglesExpected = new ArrayList<>(3);
        try {
            rectanglesExpected.add(0, new Rectangle(10, 15));
            rectanglesExpected.add(1, new Rectangle(15, 12));
            rectanglesExpected.add(2, new Rectangle(3.4, 7.12));
        } catch (GeometryException _) {
        }
        Assertions.assertIterableEquals(rectanglesExpected, rectangles);
    }

    @Test
    public void testLoader9() {
        List<Rectangle> rectangles = GeometryLoader.loadListOfRectangles("src/test/resources/inputCorrect.txt");
        Assertions.assertNotNull(rectangles);
    }
}
