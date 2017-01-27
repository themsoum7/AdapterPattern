/**
 * Created by r0bert on 01/23/2017.
 */
public class Adapter {
    public static void main(String[] args)
    {
        Shape[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i)
            shapes[i].draw(x1, y1, x2, y2);
    }
}