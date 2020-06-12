import javax.swing.*;
import java.awt.*;

public class Win extends JFrame {



    public Win() {
        setSize(500, 500);
        setTitle("Kółko i krzyżyk");
        setVisible(true);

        JLabel txt = new JLabel("Wygrał X");
        add(txt);
        setDefaultCloseOperation(3);


    }
}