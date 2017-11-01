import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;


public class FunctionPlotter extends JFrame {

    private GeneralPath path;

    private int x = 500;

    private int y = 500;

    public FunctionPlotter() {
// hasdjhajsd#asdo tesdsd
        super("FunctionPlotter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(x, y);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawFunction(g);
    }


    private void drawFunction(Graphics g) {
        path = new GeneralPath();
        path.moveTo(450, 250);

        Kreis kreis = new Kreis();

        Point punkt1 = kreis.points.get(0);
        for (Point punkt: kreis.points) {
            path.lineTo(punkt.x, punkt.y);

        }
        path.lineTo(punkt1.x, punkt1.y);

        ConfigWay way = new ConfigWay(kreis.points);
        String abstand = Double.toString(way.absa);
        System.out.println(abstand);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString(abstand, 400, 200);
        g2d.draw(path);

    }

    public static void main(String[] args) {
        new FunctionPlotter();
    }
}