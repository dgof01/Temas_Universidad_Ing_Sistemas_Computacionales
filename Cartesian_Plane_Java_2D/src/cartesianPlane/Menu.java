package cartesianPlane;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Menu extends JFrame {
    protected static Scene scene = new Scene();
    public Menu(){
        super("Cartesian Plane - Created by David Guevara");
        add(scene,BorderLayout.CENTER);
    }
}
