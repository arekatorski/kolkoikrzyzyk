import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    List<JButton> buttonList = new ArrayList<>();
    int counter = 0;
    public Main(){
        setSize(500,500);
        setTitle("Kółko i krzyżyk");
        setVisible(true);
        setDefaultCloseOperation(3);

        setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("");
            add(button);
            button.addActionListener(this); // this - to okno
            buttonList.add(button);
        }

    }




    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
	SwingUtilities.invokeAndWait(()->new Main());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        if(counter%2 == 0){
            button.setText("X");
            button.setBackground(Color.GRAY);
            counter++;
        }else{
            button.setText("O");
            counter++;
            button.setBackground(Color.DARK_GRAY);
        }
        button.setEnabled(false);

        String btn0 = buttonList.get(0).getText();
        String btn1 = buttonList.get(1).getText();
        String btn2 = buttonList.get(2).getText();
        String btn3 = buttonList.get(3).getText();
        String btn4 = buttonList.get(4).getText();
        String btn5 = buttonList.get(5).getText();
        String btn6 = buttonList.get(6).getText();
        String btn7 = buttonList.get(7).getText();
        String btn8 = buttonList.get(8).getText();



       if(
               (btn0.equals("X") && btn3.equals("X") && btn6.equals("X"))
               || (btn0.equals("X") && btn1.equals("X") && btn2.equals("X"))
               || (btn0.equals("X") && btn4.equals("X") && btn8.equals("X"))
               || (btn3.equals("X") && btn4.equals("X") && btn5.equals("X"))
               || (btn6.equals("X") && btn7.equals("X") && btn8.equals("X"))
               || (btn1.equals("X") && btn4.equals("X") && btn7.equals("X"))
               || (btn2.equals("X") && btn5.equals("X") && btn8.equals("X"))
               || (btn2.equals("X") && btn4.equals("X") && btn6.equals("X"))

       ){

              new Win();


       } else if(
               (btn0.equals("O") && btn3.equals("O") && btn6.equals("O"))
               || (btn0.equals("O") && btn1.equals("O") && btn2.equals("O"))
               || (btn0.equals("O") && btn4.equals("O") && btn8.equals("O"))
               || (btn3.equals("O") && btn4.equals("O") && btn5.equals("O"))
               || (btn6.equals("O") && btn7.equals("O") && btn8.equals("O"))
               || (btn1.equals("O") && btn4.equals("O") && btn7.equals("O"))
               || (btn2.equals("O") && btn5.equals("O") && btn8.equals("O"))
               || (btn2.equals("O") && btn4.equals("O") && btn6.equals("O"))
       ){
               new WinY();

       }

    }

}

