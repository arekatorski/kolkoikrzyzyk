import javax.swing.*;
import java.awt.*;

public class WinY extends JFrame {



    public WinY() {
        setSize(500, 500);
        setTitle("Kółko i krzyżyk");
        setVisible(true);
        JLabel txt = new JLabel("Wygrał 0");
        add(txt);
        setDefaultCloseOperation(3);
        txt.setHorizontalAlignment(JLabel.CENTER);
        txt.setVerticalAlignment(JLabel.CENTER);


    }
}
