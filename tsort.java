import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class tsort
{ 
  public static void main(String[] args)
  {    
    //load file
    String file = args[0];
    Scanner sc = null;
    try
    {
      sc = new Scanner(new File(file));
    }
    catch (Exception e)
    {
      System.out.println(e.toString());
    }
    
    //loop through lines
    Graph g = new Graph();
    while (sc.hasNextLine())
    {
      String line = sc.nextLine();
      String[] s = line.split("\\s+");
      int point = Integer.parseInt(s[0]);
      int target = Integer.parseInt(s[1]);
      g.add(point, target);
    }
    
    //do everything
    
    g.list(); //see all points in a list
    
    g.sort();
    
    
  }
}