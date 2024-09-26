package ss6.bai_tap.Cricle;

public class MainCricleCylinder {

    public static void main(String[] args) {
            Cricle cricle = new Cricle(1,"red");
            Cylinder cylinder = new Cylinder(1,5,"blue");
            System.out.println(cylinder);
            System.out.println(cricle);
            System.out.println(cricle.getArea());
            System.out.println(cylinder.getArea());
            System.out.println(cylinder.getVolume());
        }
    }

