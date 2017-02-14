package Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TextUpperCaseDecorator extends JButton {

    public TextUpperCaseDecorator(JButton bouton) {
        super(bouton.getText());
        
        for(ActionListener actionListener : bouton.getActionListeners()){
            this.addActionListener(actionListener);
        }        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setText(getText().toUpperCase());
            }
        });
    }
}
