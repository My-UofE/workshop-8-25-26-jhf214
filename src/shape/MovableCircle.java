package shape;

public class MovableCircle implements Movable, Shape { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }
  @Override
  public void moveDown() {
	 center.moveDown();// move the center down
  }
  @Override
  public void moveLeft() {
	 center.moveLeft();// move the center left
  }
  @Override
  public void moveRight() {
	 center.moveRight();// move the center right
  }

  @Override
  public double area() {
    return radius * radius * Math.PI;
  }
  @Override
  public double perimeter() {
    return radius * 2 * Math.PI;
  }

  @Override
  public String toString() {
    return String.format("[center=%s, radius=%d]", this.center, this.radius);
  }

}
