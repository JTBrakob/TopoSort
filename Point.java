import java.util.ArrayList;
import java.util.Random;

public class Point
{
  private int value;
  private ArrayList<Integer> connections = new ArrayList<Integer>();
  private Boolean visited = false;
    
  //constructor
  public Point(int i)
  {
    value = i;
  }
  
  //add a link
  public void add(int i)
  {
    connections.add(i);
  }
  
  //return random
  public int next()
  {
    Random random = new Random();
    int i = random.nextInt(connections.size());
    return connections.get(i);
  }
  
  //equals
  public Boolean equals(int i)
  {
    if (this.value == i)
      return true;
    else
      return false;
  }
  
  //get visited
  public Boolean seen()
  {
    return visited; 
  }
  
  //set visited
  public void setSeen(Boolean b)
  {
    visited = b;
  }
  
  //print
  public String list()
  {
    String s = "";
    s = s + value + ":  ";
    for(Integer i : connections)
    {
      s = s + i + " ";
    }
    return s;
  }
  
}