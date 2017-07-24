package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Nataly");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point();
    p.p1 = 5;
    p.q1 = 6;
    p.p2 = 5;
    p.q2 = 6;
    //double dis = Math.sqrt(Math.pow((p1 - q1), 2) + Math.pow((p2 - q2), 2));

        System.out.println("Расстояние между двумя точками " + "(p1, q1) = " + "(" + p.p1 + ", " + p.q1 + ")" + " и " + "(p2, q2) = " + "(" + p.p2 + ", " + p.q2 + ")" + " = " + dist(p));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double dist(Point p) {
    return Math.sqrt(Math.pow((p.p1 - p.q1), 2) + Math.pow((p.p2 - p.q2), 2));
  }
}