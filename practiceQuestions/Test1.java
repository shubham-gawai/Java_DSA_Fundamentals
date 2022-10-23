
import java.util.*;

class Area {
	
    int length;
    int breadth;
    
    Area(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public int calArea()
    {
		return length*breadth;
        // write your logic here
    }

}
 
 public class Test1{
	 
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a=new Area(l,b);
        System.out.println(a.calArea());
    }
}