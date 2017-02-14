package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class HideOnClickDecorator extends JButton {

    public HideOnClickDecorator(JButton bouton) {
        super(bouton.getText());

        for (ActionListener actionListener : bouton.getActionListeners()) {
            this.addActionListener(actionListener);
        }
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }
}
