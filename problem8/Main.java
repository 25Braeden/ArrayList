package problem8;

public class Main {


    public static void main(String[] args) {

        CoordinatePlane coordinatePlane = new CoordinatePlane();
        CoordinatePoint firstPoint = new CoordinatePoint(5, 3);
        CoordinatePoint secondPoint = new CoordinatePoint(-5, 5);

        double distanceBetweenPoints = coordinatePlane.distanceBetweenPoints(firstPoint, secondPoint);
        System.out.printf("The two points have a distance of %f\n", distanceBetweenPoints);
        coordinatePlane.comparePointsToOrigin(firstPoint, secondPoint);

    }
}
