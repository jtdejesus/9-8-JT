
class Fan {

 final int SLOW = 1;
  final int MEDIUM = 2;
  final int FAST = 3;
  private int speed;
  private boolean on;
  private double radius;
  private String color;


  public Fan() {
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
  }

  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public void turn0n() {
    on = true;
  }

  public void turn0ff() {
    on = false;
  }

    public void setColor(String newColor) {
      color = newColor;
    }

   public void setRadius(double newRadius) {
      radius = newRadius;
    }

  public String getSpeed() {
    
      String s = "";
      switch (speed) {
        case SLOW: s = "slow"; break;
        case MEDIUM: s = "medium"; break;
        case FAST: s = "fast"; break;
      }
        return s;
    }

   public boolean isOn() {
      return on;
    }

  public double getRadius() {
      return radius;
    }
  public String getColor() {
      return color;
    }
  public String toString() {
  if (on == true) {
     return "\nFan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius + "\nfan is off\n";
  }
  else{
    return "\nFan color: " + color + ", radius: " + radius + "\nfan is off\n";
  }
}
}
