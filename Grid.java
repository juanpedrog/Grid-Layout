import java.awt.*;
import javax.swing.*;

        class Grid extends JFrame {
                JButton marcia = new JButton("Marcia");
                JButton carol = new JButton("carol");
                JButton greg = new JButton("greg");
                JButton jan = new JButton("jan");

                public Grid(){
                        super("Grid");
                        setSize(200,200);
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        JPanel pane = new JPanel();
                        GridLayout nombres = new GridLayout(2,2,5,5);
                        pane.setLayout(nombres);
                        pane.add(marcia);
                        pane.add(carol);
                        pane.add(greg);
                        pane.add(jan);
                        add(pane);
                        setVisible(true);
                }

                public static void main(String ar[]){
                        Grid g = new Grid();
                }

        }

