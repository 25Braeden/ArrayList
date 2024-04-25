package problem8;
import java.util.*;

public class RandomTime {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        CoordinatePlane coordinatePlane = new CoordinatePlane();

        ArrayList<CoordinatePoint> randomPoints = new ArrayList<CoordinatePoint>();
        ArrayList<CoordinatePoint> sortedPoints = new ArrayList<CoordinatePoint>();

        System.out.println("How many random coordinates would you like?");
        int numOfPoints = scanner.nextInt();

        for (int i = 0; i < numOfPoints; i++) {
            CoordinatePoint point = new CoordinatePoint(random.nextInt(9999), random.nextInt(9999));
            randomPoints.add(point);
        }

        for (CoordinatePoint currentPoint : randomPoints) {
            int indexToInsert = 0;
            double currentDistance = coordinatePlane.distanceFromOrigin(currentPoint);

            while (indexToInsert < sortedPoints.size() &&
                    coordinatePlane.distanceFromOrigin(sortedPoints.get(indexToInsert)) < currentDistance) {
                indexToInsert++;
            }

            sortedPoints.add(indexToInsert, currentPoint);
        }

        System.out.println("Sorted Points (closest to (0,0) to furthest):");
        for (CoordinatePoint point : sortedPoints) {
            System.out.println(point.getStringCords() + " " + coordinatePlane.distanceFromOrigin(point));
        }
    }
}
