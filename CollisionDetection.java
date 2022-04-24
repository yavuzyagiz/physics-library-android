public class CollisionDetection {

    public static boolean collisionPointAndLine(Vector2d point, Line line) {
        float dx = line.getP2().getX() - line.getP1().getX();
        float dy = line.getP2().getY() - line.getP1().getY();
        float m = dy / dx;
        // line -> y=mx+b  -> b = y-mx
        float b = line.getP1().getY() - m * line.getP1().getX();
        return point.getY() == m * point.getX() + b;
    }

    public static boolean collisionPointAndCircle(Vector2d point, Circle circle) {
        Vector2d centerCircle = circle.getCenter();
        Vector2d centerToPoint = new Vector2d(point).sub(centerCircle);
        return centerToPoint.getLength() < circle.getRadius();
    }

    public static boolean collisionPointAndRectangle(Vector2d point, Rectangle rectangle){
        Vector2d bottomLeft = rectangle.getBottomLeft();
        Vector2d topRight = rectangle.getTopRight();
        return point.getX() <= topRight.getX() && bottomLeft.getX() <= point.getX() &&
                point.getY() <= topRight.getY() && bottomLeft.getY() <= point.getY();
    }

    public static boolean collisionCircleAndCircle(Circle circle1, Circle circle2){
        float distance = Vector2d.distance(circle1.getX(),circle1.getY(),circle2.getX(),circle2.getY());
        return distance <= circle1.getRadius() + circle2.getRadius();
    }
}
