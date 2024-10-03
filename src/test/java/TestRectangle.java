import geometry.Rectangle;
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
        Assertions.assertThrows(Exception.class,
                                ()->{Rectangle r1 = new Rectangle(-15, 10);});
    }

    @Test
    public void testConstructorBad2(){
        Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(15, -10);});
    }
    @Test
    public void testConstructorBad3(){
        Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(-15, -10);});
    }
    @Test
    public void testConstructorBad4(){
        Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(0, 10);});
    }
    @Test
    public void testConstructorBad5(){
        Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(150, 0);});
        /*Assertions.assertThrows(Exception.class,
                ()->{Rectangle r2 = new Rectangle(150, 0);},
                "сообщение от ассерта");*/
    }
}
