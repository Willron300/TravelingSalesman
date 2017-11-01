import java.awt.*;
import java.util.ArrayList;

public class ConfigWay {
    ArrayList<Point> points;
    double absa;
    public ConfigWay(ArrayList<Point> list_points) {
       points = list_points;
       absa = abstand();
       System.out.println("Abstand" + absa);
    }
    public ArrayList<Point> calculate(ArrayList<Point> points) {


        return points;
    }
    public double abstand() {
        double size = 0;
        for(int i = 0; i<points.size()-1; i++){
            Point p1 = points.get(i);
            Point p2;
            if(i== points.size()-1) {
                p2 = points.get(0);
            }else {
                p2 = points.get(i+1);
            }
            size +=  Math.sqrt(
                (p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) +
                        (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
        }

        return size;
    }
}
