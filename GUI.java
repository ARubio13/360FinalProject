import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener{

    JFrame frame;
    JMenuBar menuBar;
    JMenu File, About;
    JMenuItem Load, Add, Save, Plot;

    public GUI() {

        menuBar = new JMenuBar();

        File = new JMenu("File");
        menuBar.add(File);

        About = new JMenu("About");
        About.addActionListener(this);
        menuBar.add(About);
        About.addSeparator();

        Load = new JMenuItem("Load A Roster");
        Load.addActionListener(this);
        File.add(Load);
        File.addSeparator();


        Add = new JMenuItem("Add Attendance");
        Add.addActionListener(this);
        File.add(Add);
        File.addSeparator();

        Save = new JMenuItem("Save");
        Save.addActionListener(this);
        File.add(Save);
        File.addSeparator();

        Plot = new JMenuItem("Plot Data");
        Plot.addActionListener(this);
        File.add(Plot);

        frame = new JFrame("CSE 360 Final Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setJMenuBar(menuBar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == About) {

            // WIP

        }

        if (e.getSource() == Load) {

            // WIP

        }

        if (e.getSource() == Add) {

            // WIP

        }

        if (e.getSource() == Save) {

            // WIP

        }

        if (e.getSource() == Plot) {

            // WIP

        }

    }
}