package problem8;

public class CoordinatePoint {
    public int x;
    public int y;

    public CoordinatePoint (int xcord, int ycord) {
        x = xcord;
        y = ycord;
    }

    public String getStringCords() {
        return (x + ", " + y);
    }

}
