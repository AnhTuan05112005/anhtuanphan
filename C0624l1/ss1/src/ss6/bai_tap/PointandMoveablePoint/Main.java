package ss6.bai_tap.PointandMoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,1,5,5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.setSpeed(10,15);
        System.out.println(moveablePoint);
        MoveablePoint checkMoveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);
        System.out.println(checkMoveablePoint);

    }
}
