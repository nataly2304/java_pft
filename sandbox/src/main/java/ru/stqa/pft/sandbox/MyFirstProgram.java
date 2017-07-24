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

    double p1 = 5;
    double q1 = 6;
    double p2 = 5;
    double q2 = 6;
    double dis = Math.sqrt(Math.pow((p1 - q1), 2) + Math.pow((p2 - q2), 2));
    System.out.println("Расстояние между двумя точками " + "(p1, q1) = " + "(" + p1 + ", " + q1 + ")" + " и " + "(p2, q2) = " + "(" + p2 + ", " + q2 + ")" + " = " + dis);
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

 /* public static double distanse(double p1; double p2) {

  }*/
}