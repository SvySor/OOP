package OOP.Lecture01.Ex003;

public class Program {
    // static double distance(Point2D a, Point2D b) {
    //     return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    // }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // a.setX(12);
        System.out.println(a.getX());
        System.out.println(a.getY());

        // a = new Point2D(12);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(0);
        System.out.println(b.toString());

        // System.out.println(distance(a, b));

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}

// Пример: пароль можно изменить, но никто не видит. Аккаунт видят все, но
// изменить нельзя.