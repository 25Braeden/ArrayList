package problem8;

public class CoordinatePlane {

    public void comparePointsToOrigin(CoordinatePoint firstPoint, CoordinatePoint secondPoint) {
        if (distanceFromOrigin(firstPoint) < distanceFromOrigin(secondPoint)) {
            System.out.printf("(%s) is closer to (0, 0) than (%s)\n", firstPoint.getStringCords(), secondPoint.getStringCords());
        } else if (distanceFromOrigin(firstPoint) > distanceFromOrigin(secondPoint)) {
            System.out.printf("(%s) is closer to (0, 0) than (%s)\n", secondPoint.getStringCords(), firstPoint.getStringCords());
        } else {
            System.out.println("The two points have the same distance from the origin\n");
        }
    }

    public double distanceBetweenPoints(CoordinatePoint point1, CoordinatePoint point2) {
        return Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
    }

    public double distanceFromOrigin(CoordinatePoint point) {
        return Math.sqrt(Math.pow(point.x, 2) + Math.pow(point.y, 2));
    }
}
