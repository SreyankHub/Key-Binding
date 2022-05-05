import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    JLabel label;
    Action Up;
    Action Down;
    Action Right;
    Action Left;

    Frame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        Up = new UpAction();
        Down = new DownAction();
        Left = new LeftAction();
        Right = new RightAction();


        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"Up");
        label.getActionMap().put("Up",Up);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"Down");
        label.getActionMap().put("Down",Down);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"Left");
        label.getActionMap().put("Left",Left);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"Right");
        label.getActionMap().put("Right",Right);


        this.add(label);
        this.setVisible(true);

    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }
    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
        }
    }

}
