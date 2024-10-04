import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class keybindings {
    /*Key Bindings = bind an action to a keystroke
    *               don't resuire you to click a component to give it focus
    *               all swing components use key bindings
    *               increased flexibility compared to KeyListeners
    *               can assign keystokes to indivisual swing components
    *               more difficult  to utilize and set up */

    Action upaction;
    Action downaction;
    Action leftaction;
    Action rightaction;

    JFrame frame;
    JLabel label;

    keybindings() {

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);


        upaction = new UpAction();
        downaction = new DownAction();
        leftaction = new LeftAction();
        rightaction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upaction"); // can use 'w' for getkeystroke
        label.getActionMap().put("upaction", upaction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downaction"); // can use 'S' for getkeystroke
        label.getActionMap().put("downaction", downaction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftaction"); // can use 'a' for getkeystroke
        label.getActionMap().put("leftaction", leftaction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightaction"); // can use 'd' for getkeystroke
        label.getActionMap().put("rightaction", rightaction);


        frame = new JFrame();
        frame.setTitle("Keybindings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);



    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }
    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }


}
