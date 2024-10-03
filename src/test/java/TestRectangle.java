import geometry.GeometryException;
import geometry.NegativeLengthException;
import geometry.Rectangle;
import geometry.ZeroLengthException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {
    @Test
    public void testConstructorOk(){
        Assertions.assertDoesNotThrow(()->{
            Rectangle r1 = new Rectangle(15, 10);
            Rectangle r2 = new Rectangle(10, 15);
            Rectangle r3 = new Rectangle(10, 10);
        });
    }
    @Test
    public void testConstructorBad1(){
        Assertions.assertThrows(NegativeLengthException.class,
                                ()->{Rectangle r1 = new Rectangle(-15, 10);});
    }

    @Test
    public void testConstructorBad2(){
        Assertions.assertThrows(NegativeLengthException.class,
                ()->{Rectangle r2 = new Rectangle(15, -10);});
    }
    @Test
    public void testConstructorBad3(){
        Assertions.assertThrows(NegativeLengthException.class,
                ()->{Rectangle r2 = new Rectangle(-15, -10);});
    }
    @Test
    public void testConstructorBad4(){
        Assertions.assertThrows(ZeroLengthException.class,
                ()->{Rectangle r2 = new Rectangle(0, 10);});
    }
    @Test
    public void testConstructorBad5(){
        Assertions.assertThrows(ZeroLengthException.class,
                ()->{Rectangle r2 = new Rectangle(150, 0);});
        /*Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(150, 0);},
                "сообщение от ассерта");*/
    }

    @Test
    public void testPerimeter1(){
        // метод тестирования метода1 {
        //		создаем объект Класса, настраиваем свойства
        //      w=10 l=15   perimeter = 50
        //		Assertions.assertEquals()
        //	}

        try {
            Rectangle r = new Rectangle(10, 15);
            Assertions.assertEquals(50, r.perimeter());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testArea1(){
        //метод тестирования метода1 {
        //		создаем объект Класса, настраиваем свойства
        //      w=10 l=15   area = 150
        //		Assertions.assertEquals()
        //	}
        try {
            Rectangle r = new Rectangle(10, 15);
            Assertions.assertEquals(150, r.area());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
