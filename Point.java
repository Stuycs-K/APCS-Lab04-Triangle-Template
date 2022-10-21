public class Point{
  private double x,y;
  
  /*Return a string in the format: (x, y)
  *where x and y are the values from the Point.
  *e.g.  "(0.0, 1.23)"  or  "(-1.02, 21.45)"
  */
  public String toString(){
    //your code here
  }
  
  public static double distanceTo(Point a, Point b){
   //your code here 
  }
  
  public double distanceTo(Point other){
   //your code here 
  }

  
  
  public static boolean closeEnough(double a, double b){
    //How can you determine if two values are close enough to eachother?
    //you write this later
    return false;
  }
  
  /*Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *To avoid issues: If one is 0.0, the other must be exactly 0.0.
  */
  public boolean equals(Point other){
    //You write this later
  }
  
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}

