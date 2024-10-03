package geometry;

public class Main {
    public static void main(String[] args) {
        try {
            Rectangle r1 = new Rectangle(10, 15);
            System.out.println("r1 = " + r1);
            Rectangle r2 = new Rectangle(10, -15);
            System.out.println("r2 = " + r2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("вне зависимости от успешности того, что написано в блоке try{}," +
                "в этом месте уже нет видимости переменных r1, r2");

    }
}