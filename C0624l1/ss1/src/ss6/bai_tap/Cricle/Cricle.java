package ss6.bai_tap.Cricle;

public class Cricle {

    private float radius;
    private String color;

    public Cricle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Cricle() {
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }


}
