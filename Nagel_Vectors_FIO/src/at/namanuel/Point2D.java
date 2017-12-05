package at.namanuel;

public class Point2D {
    private String mName;
    private double mX;
    private double mY;

    /**
     * Construct a point with (x, y) set to the origin and a default name.
     */
    public Point2D() {
        mX = 0;
        mY = 0;
        mName = "vector";
    }

    /**
     * Construct a point with the passed (x, y) coordinates and a default name.
     * @param x coordinate
     * @param y coordinate
     */
    public Point2D(double x, double y) {
        this.mX = x;
        this.mY = y;
        this.mName = "vector";
    }

    /**
     * Construct a point with the passed (x, y) coordinates and the passed name.
     * @param x coordinate
     * @param y coordinate
     * @param name for the new vector
     */
    public Point2D(double x, double y, String name) {
        this.mX = x;
        this.mY = y;
        this.mName = name;
    }

    /**
     * Set (x, y) coordinates of vector.
     * @param x coordinate
     * @param y coordinate
     */
    public void setPos(double x, double y) {
        this.mX = x;
        this.mY = y;
    }

    /**
     * Calculate length from origin.
     * @return length of vector
     */
    public double calculateLength() {
        return Math.hypot(mX, mY);
    }

    /**
     * Calculate distance from this point to another point.
     * @param point to calculate the distance to
     * @return
     */
    public double distanceTo(Point2D point) {
        return Math.hypot(mX - point.getX(), mY - point.getY());
    }

    /**
     * Print name, coordinates and length of a vector.
     */
    public void printInformation() {
        System.out.println(mName);
        System.out.format("coords: %10.2f, %10.2f%n", mX, mY);
        System.out.format("length: %10.2f%n%n", this.calculateLength());
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public double getX() {
        return mX;
    }

    public void setX(double x) {
        this.mX = x;
    }

    public double getY() {
        return mY;
    }

    public void setY(double y) {
        this.mY = y;
    }
}
