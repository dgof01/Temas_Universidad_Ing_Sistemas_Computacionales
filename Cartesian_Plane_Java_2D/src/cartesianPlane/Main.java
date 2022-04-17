package cartesianPlane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import constants.Constants;

public class Main {
    // Creación del Frame Principal
    public static void createFrame() {
        Menu frame = new Menu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Constants.WIDTH, Constants.HEIGHT);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Control de Elementos Swing - Hilo
    // https://ajaxhispano.com/ask/swingutilitiesinvokelater-por-que-se-necesita-49788/
    // https://laingenieria.info/questions/16057/cual-es-la-ventaja-del-metodo-swingutilitiesinvokelater
    // https://vintage-kitchen.com/es/guide/what-is-swingutilities-invokelater-new-runnable/#What_is_SwingUtilities_invokeLater_new_runnable

    public static void main(String[]args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createFrame();
            }
        });
    }
}
