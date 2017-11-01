import java.awt.*;
import java.util.*;
import java.math.*;

public class Kreis{
    ArrayList<Point> points;

    public Kreis(){
        points = generate(5);

        Collections.shuffle(points);
    }
    public static ArrayList<Point> generate(int l){
        ArrayList<Point> points = new ArrayList<Point>();
        for(int i = 0; i<359; i=i+15){
            int a = (int)(Math.cos(Math.toRadians(i))* 200)+250;
            int b = (int)(Math.sin(Math.toRadians(i))* 200)+250;
            Point punkt = new Point(a, b);
            points.add(punkt);
        }
        return points;
    }
}
