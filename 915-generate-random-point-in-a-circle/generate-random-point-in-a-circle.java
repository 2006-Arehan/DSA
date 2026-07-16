class Solution {

    double radius;
    double x;
    double y;

    public Solution(double radius,
                    double x_center,
                    double y_center) {

        this.radius = radius;
        this.x = x_center;
        this.y = y_center;
    }

    public double[] randPoint() {

        double theta = 2 * Math.PI * Math.random();

        double dist = radius * Math.sqrt(Math.random());

        return new double[]{
                x + dist * Math.cos(theta),
                y + dist * Math.sin(theta)
        };
    }
}