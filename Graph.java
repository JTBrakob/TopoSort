import java.util.ArrayList;
import java.util.Random;

public class Graph
{
  private ArrayList<Point> points;
  
  public Graph()
  {
    points = new ArrayList<Point>();
  } 
  
  //makes the points
  public void add(int pt, int tgt)
  {
    if(exists(pt) == false)
    {
      points.add(new Point(pt));
    }
    
    if(exists(tgt) == false)
    {
      points.add(new Point(tgt));
    }

    int location = locationOf(pt);
    Point temp = points.get(location);
    temp.add(tgt);
    points.set(location, temp);
    
  }
  
  //inefficient method to see if a point already exits
  private Boolean exists(int i)
  {
    for (Point p : points)
    {
      if (p.equals(i))
        return true;
    }
    return false;
  }
  
  //get location of Point in arrayList
  private int locationOf(int p)
  {
    for(int i = 0; i != points.size(); i++)
    {
      if (points.get(i).equals(p))
        return i;
    }
    return -1;
  }
  
  //sort
  public void sort()
  {
    Random random = new Random();
    int i = random.nextInt(points.size());
    //keep going until hits end
  }

  
  //print as list
  public void list()
  {
    System.out.println("All the points and their connections: ");
    for (Point p : points)
    {
      System.out.println(p.list());
    }
  }
} 