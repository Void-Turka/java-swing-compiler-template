import javax.swing.*;

public class Menu {


    public JMenuBar createMenu(JFrame frame) {


        JMenuBar menuBar = new JMenuBar();


        // Ana menüler

        JMenu file = new JMenu("File");

        JMenu help = new JMenu("Help");


        // File > New

        JMenu newMenu = new JMenu("New");

        JMenuItem newProject = new JMenuItem("New Project");

        JMenuItem newFile = new JMenuItem("New File");

        JMenuItem newFolder = new JMenuItem("New Folder");


        newMenu.add(newProject);

        newMenu.add(newFile);

        newMenu.add(newFolder);



        // File > Open

        JMenu open = new JMenu("Open");


        JMenuItem openProject = new JMenuItem("Open Project");

        JMenuItem openFile = new JMenuItem("Open File");

        JMenuItem openFolder = new JMenuItem("Open Folder");


        open.add(openProject);

        open.add(openFile);

        open.add(openFolder);



        // Exit

        JMenuItem exit = new JMenuItem("Exit");


        exit.addActionListener(e -> {

            System.exit(0);

        });



        // Help > About

        JMenuItem about = new JMenuItem("About");


        about.addActionListener(e -> {


            JOptionPane.showMessageDialog(

                    frame,

                    "Lynx Forge Compiler\nCreated with Java Swing"

            );


        });



        // Menüleri yerleştir

        file.add(newMenu);

        file.add(open);

        file.addSeparator();

        file.add(exit);



        help.add(about);



        menuBar.add(file);

        menuBar.add(help);



        return menuBar;

    }

}