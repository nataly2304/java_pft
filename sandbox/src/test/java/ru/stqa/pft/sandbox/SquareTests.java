package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }

  @Test
  public void testArea2(){
    Rectangle r = new Rectangle(4,6);
    Assert.assertEquals(r.area(), 24.0);
  }

  @Test
  public static void testPoint(){
    Point p1 = new Point(5,7);
    Point p2 = new Point(1,4);
    Assert.assertEquals(p1.distance(p2.x,p2.y), 5.0);
  }

  @Test
  public static void testPoint2(){
    Point p1 = new Point(5,7);
    Point p2 = new Point(1,4);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
}
