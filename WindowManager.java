import javax.swing.*;

public class WindowManager {

    private JFrame frame;


    public void createWindow() {

        frame = new JFrame("Open Sourced ");

        frame.setSize(1350, 700);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);


        Menu menu = new Menu();

        frame.setJMenuBar(menu.createMenu(frame));


        frame.setVisible(true);

    }


    public JFrame getFrame() {

        return frame;

    }

}