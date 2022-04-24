public class Rotate {
    public static void apply(Vector2d vector2d, float angleDegree, Vector2d origin) {
        float x = vector2d.getX() - origin.getX();
        float y = vector2d.getY() - origin.getY();
        float cos = (float) Math.cos(Math.toRadians(angleDegree));
        float sin = (float) Math.sin(Math.toRadians(angleDegree));
        float x2 = (x * cos) - (y * sin);
        float y2 = (x * sin) + (y * cos);
        vector2d.set(x2 + origin.getX(), y2+origin.getY());
    }
}
