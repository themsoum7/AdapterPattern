/**
 * Created by r0bert on 01/23/2017.
 */
class Line implements Shape {
    private LegacyLine adaptee = new LegacyLine();
    public void draw(int x1, int y1, int x2, int y2)
    {
        adaptee.draw(x1, y1, x2, y2);
    }
}