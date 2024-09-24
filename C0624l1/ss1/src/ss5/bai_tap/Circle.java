package ss5.bai_tap;


import java.time.LocalTime;
import java.util.Scanner;
import java.util.Scanner;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }

}
